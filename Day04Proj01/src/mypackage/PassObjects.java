package mypackage;

class Employee {
    //instance variables
    int id1, id2;
    Employee(int id1, int id2) {
        this.id1 = id1;
        this.id2 = id2;
    }
 }
    class Check1 {
        //to interchange employee class Objects
        void swap(Employee obj) {
            int temp;
            temp = obj.id1;
            obj.id1 = obj.id2;
            obj.id2 = temp;
        }

    }
    public class PassObjects {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Employee obj1 = new Employee(10, 20);

            Check1 c = new Check1();
            //display data before call 
            System.out.println(obj1.id1 + " " + obj1.id2);
            c.swap(obj1);
            //display after swap
            System.out.println(obj1.id1 + " " + obj1.id2);
        }

    }
