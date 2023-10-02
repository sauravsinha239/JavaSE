public class Pattern002 {
   
    public static void main(String[] args) 
    {
        int a = 1;
        boolean stat = true;

        while(a >= 1 && a <= 7) 
        
        {
            for(int i = 1; i <= 7; i++) {
                if(i <= 7-a) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        System.out.println();

        if(a == 7) {
            stat = false;
        }

        if(stat) {
            a += 2;
        } else {
            a -=2;
        }

        
    }
}
}