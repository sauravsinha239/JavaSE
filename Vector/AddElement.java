import java.util.Vector;


public class AddElement {


    public static void main(String[] args) {


      

        Vector<String> vs = new Vector<>();//for String 

        vs.add("Hello");
        vs.add("java");
        
       /**
        * addElement()   It is used to append the specified 
        component to the end of this vector.
         It increases the vector size by one.
        * 
        */

         System.out.println("Elements of Vector are  -->>\t "); 

        for (String str : vs) {   

           System.out.println("Element  ->>\t " +str);


        }

         //Add New Element in vector vc

            vs.addElement("Welcome to Vector");  
            //After addition, print all the elements again  

            System.out.println("Elements after addition -->>\t");

            for (String str : vs) {       

               System.out.println("Element ->> \t" +str);  

            }
        }


    
}
