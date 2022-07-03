package mypackage;

import java.io.*;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class CreateNewFile {
	
	private static void CreateFileUsingFileClass() throws IOException {
		File file = new File("D:\\Full stack\\beststudents2.txt");
		
		//create the File
		if(file.createNewFile()) {
			System.out.println("File created");
		}else {
			System.out.println("File already exists");
		}
		//write content to the file
		FileWriter writer = new FileWriter(file);
		writer.write("June Batch FSD participants are active participants");
		writer.close();
	}
	private static void CreateNewFileUsingFileOutputStreamClass() throws IOException {
		String data = "Hey Folks.. complete assignment";
		FileOutputStream out = new FileOutputStream("D:\\Full stack\\job2.txt");
		out.write(data.getBytes());
		out.close();
	}
	private static void CreateFileIn_NIO() throws IOException {
		String data = "Hy folks";
		Files.write(Paths.get("D:\\Full stack\\26june2.txt"), data.getBytes());
		List<String> lines = Arrays.asList("1st line","2nd Line");
		Files.write(Paths.get("job2.txt"),lines,StandardCharsets.UTF_8,
				StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			CreateFileUsingFileClass();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
