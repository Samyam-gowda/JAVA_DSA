// import java.util.*;

// package loops;

import java.util.Scanner;

public class forloop {
    
    public static void main(String[] args) {


        // for(int i =0 ; i < 10 ; i++ ){
        //     System.out.println("**********************");
        // }
        // int num = 10000;
        // int num2 = 0;
        // for(int i = 0 ; num  > 0 ; i++){
        //     int last_dig = num%10;
        //     num2 = num2*10 + last_dig;
        //     num = num/10;
        // }
        // System.out.println(num2);


        Scanner var  = new Scanner(System.in);
        System.out.println("enter the numer:");
        int num = var.nextInt();

        // for(int i = 2 ; i < num ; i++){
        //     if(num%i == 0){
        //         System.out.println("not a prime");
        //         break;
        //     }
            
        // }
        // System.out.println("prime");

        int fact = 1 ;
        for(int i = num ; i > 0 ; i--){
            fact = fact * i ;
        }
        System.out.println(fact);
}
}
