import java.util.Vector;
public class VectorRemove {



    public static void main(String[] args)  
    {

          Vector<Integer> VI= new Vector<>(); // for Integer  Vector

        /**
         *   Use add() to Insert Elements in Vector
         */

        Vs.add("hello   from  java "); // inserting String on Vector 

        VI.add(4);
        VI.add(5);
        VI.add(6);
        VI.add(8);
        VI.add(9);
        VI.add(10);
        VI.add(13);
        VI.add(12);
       
        System.out.println("Integer vector -->>"+VI);

         /*
         * 
         * For remove elements in Vector  VI.remove(index of element );
         */
         VI.remove(3);
        System.out.println("Integer After removed index 3 ->>"+VI);


    
    }
    
}
