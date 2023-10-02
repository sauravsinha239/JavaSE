
import java.util.Scanner;

class Students{
  static  Scanner sc =new Scanner(System.in);

   static int rollno, total_marks,par;
    static String name , address, grade , stream;

    static void input()
    {
        
        System.out.println("Enter name - ");
        name=sc.next();
        System.out.println("roll no- ");
        rollno=sc.nextInt();
        System.out.println("Address - ");
        address=sc.next();
        System.out.println("Stream - ");
        stream=sc.next();
        
    }
    static void display()
    {
        System.out.println(" name - "+name);
        System.out.println("Enter Rollno - "+rollno);
        System.out.println("Address- "+address);
        System.out.println("Stream - "+stream);
    }

    public static void main(String[] args) {
        
        input();
        display();
    }
}