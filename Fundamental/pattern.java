package com.pattern1;
//Creatin package com.patter1;

//making classses for pattern;
class pattern{
public static void main(String[] args){

    /***
     ///////
    Print this pattern 
     *
     * *
     * * *
     * * * *
     * * * * *

    */

   for (int i = 1; i < 6; i++) {

    for (int j = 1; j<i; j++) {
        System.out.print(" * ");
    }
    System.out.print("\n");

}
    
}
}