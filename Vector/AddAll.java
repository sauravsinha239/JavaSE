 /**
         * 
         * for addAll();  /Add elements of the vec2 at 1st element position in the vec1
         * 
         * It is used to append all of the elements in the specified collection to the end of this Vector.
         */

import java.util.Vector;

class AddAll{


   
    public static void main(String[] args)  
    {

          Vector<Integer> VI= new Vector<>(); // for Integer  Vector VI
          Vector<Integer> V2= new Vector<>(); // for Integer  Vector v2
        
      


        /**
         *   Use add() to Insert Elements in Vector
         */

        // adding elements on VI();
        VI.add(4);
        VI.add(5);
        VI.add(6);
        VI.add(7);
        VI.add(8);
        //Adding elements on V2 ()

        V2.add(1);
        V2.add(2);
        V2.add(3);

        System.out.println(" Displaying V1 Integer vector -->>"+VI);
        System.out.println(" Displaying V2 Integer vector -->>"+VI);

        // Append all vector  v1 v2 

         VI.addAll(0,V2);  

        System.out.println(" Displaying Final  Integer vector list  -->>"+VI);

    }



}