/**
 * 
 * 
 * Vector Implements Dynamic Arrays.
 * Vector can Holds Object of any types and any Numbers.
 * Vector class is Contained in java.utiil.package.
 * Vector is diffrent from Array in two ways:-
 * 1 Vector is synchronized
 * 2 it contains many legacy methods that are not part of the collections Framework(i. Enumeration and Iterator)
 * 
 * 
 * Vector list = new Vector(); Creates a default Vector which has an initial size of 10.
 * Vector list= new Vector(int size); Creates a Vector whose initial capacity is specified by the size;
 * Vector list = new Vector(int size, int incr) size  define the capacity of the vector
 * and incr increment the capacity of the vector
 * 
 * 
 * A Vector can be declared without specifying any size explicitly
 * 
 *
 */
import java.util.Vector;
public class VectorEx {
    
    public static void main(String[] args) {


        Vector<Integer> VI= new Vector<>(); // for Integer  Vector

        Vector<String> Vs = new Vector<>();//for String 


        /**
         *   Use add() to Insert Elements in Vector
         */

        Vs.add("hello   from  java "); 
        


        VI.add(4);
        VI.add(5);
        VI.add(6);
        VI.add(8);
        VI.add(9);
        VI.add(10);
        VI.add(13);
        VI.add(12);
         System.out.println("String "+Vs);
        System.out.println("Integer"+VI);

        /*
         * 
         * For remove elements in Vector  VI.remove(index of element );
         */
         VI.remove(3);
        System.out.println("Integer"+VI);



        /**
         * 
         * for addAll();  /Add elements of the vec2 at 1st element position in the vec1
         * 
         * It is used to append all of the elements in the specified collection to the end of this Vector.
         */
        
         Vector<Integer> v1=new Vector<>();
         Vector<Integer> v2=new Vector<>();
            // inserting in v1
         v1.add(4);
         v1.add(5);
         v1.add(6);

         System.out.println("V1 Elements is "+v1);

         //inserting in V2 
         v2.add(1);
         v2.add(2);
         v2.add(3);

         System.out.println("V2 elements"+v2);

         //vector  appending  

         v1.addAll(0,v2);
           //Printing the final vector after appending  

         System.out.println("After Appending Final v1 + v2 is ="+v1);


       /**
        * addElement()   It is used to append the specified 
        component to the end of this vector.
         It increases the vector size by one.
        * 
        */


        //Example 
        Vector<String> vc = new Vector<>(3);  

        // adding elements
        vc.add("A");  
        vc.add("B");  
        vc.add("C"); 
        System.out.println("Elements of Vector are ");             
        for (String str : vc) {           
           System.out.println("Element= " +str);
        }
            
            //Add New Element in vecter vc

            vc.addElement("Welcome to Vector");  
            //After addition, print all the elements again   
            System.out.println("Elements after addition");             
            for (String str : vc) {           
               System.out.println("Element= " +str);  
            }

                /**
                 * Capacity()   	It is used to get the current capacity of this vector.
                 */

                 System.out.println("Capacity of Vector is "+vc.capacity());

        /**
         * 
         * The clear() method of Java Vector class is used to remove all of the elements from the vector which is in use.
         * 
         * syntax = clear();
         */

          //Print the size of vector  
          System.out.println("Size of Vector before clear() method: "+VI.size());

          //Clear the vector  

          VI.clear();  
          System.out.println("Size of Vector after clear() method: "+VI.size());  


          /*
           * The clone() method of Java Vector class is used to get a clone of the vector
           */

           System.out.println("Original vector: "+vc);        
           System.out.println("Cloned vector: "+vc.clone());  


           /**
            * The elementAt() method of Java Vector class is used to get the element at the specified index in the vector.

            */

            System.out.println("Element at index 0 is = "+vc.elementAt(0));  
            System.out.println("Element at index 3 is = "+vc.elementAt(3));  
    }
}
