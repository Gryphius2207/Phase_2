package com.hari.flyawaypkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import java.util.Properties;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




@WebServlet("/pay")
public class Payment extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname= request.getParameter("fname");
		String lname=request.getParameter("lname");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		//String fmodel= request.getParameter("model");
		String flightid=request.getParameter("flightid");
		String dot = request.getParameter("dot");
		String tktprice = request.getParameter("price");
		String emailid = request.getParameter("email");
		String cardno = request.getParameter("cardno");
		String zipcode = request.getParameter("zipcode");
		String status = "Paid";
		
		
		
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    
	    UUID uuid = UUID.randomUUID();
        String bookingrefno = uuid.toString();
	    
	    PrintWriter out = response.getWriter();  
		response.setContentType("text/html");
		
	    SessionFactory theFactory = new Configuration().configure("hibernate-config.xml").addAnnotatedClass(TblBooking.class).buildSessionFactory();
		try
		{	
			Session theSession = theFactory.getCurrentSession();
			
			TblBooking t1 = new TblBooking(fname, lname, address, dob, contact, emailid, dot, flightid, tktprice, cardno, zipcode, status, date);
			
			theSession.beginTransaction();
			
			theSession.save(t1);
			
			theSession.getTransaction().commit();
		       
		    theSession.close();
		    
	
		    
		    request.setAttribute("refno", bookingrefno);
		    
		    request.getRequestDispatcher("success.jsp").forward(request, response);
		    
		 
		
		}
		catch(Exception ex)
		{
			out.println("<h3>Sorry, we are unable to process your transaction. Please contact our customer care emailId below.</h3><br>");
			out.println("<a href='mailto=helpdesk@flyaway.com?subject=TransactionFailed'>helpdesk@flyaway.com</a>");
		}
		finally
		{
			 theFactory.close();
		}
		
	}

}
