// package functions;

import java.util.Scanner;

public class functions {

    public static int sum(int a , int b){
        int sum  = a +b ;
        System.out.println(sum);  
        return sum ;
    }

    public static int fact(int num){
        int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact  = fact * i;

        }
        return fact;
    }
    
    public static void main(String[] args) {

        Scanner var  = new Scanner(System.in);
        System.out.println("Enter the value of n and r number");
        int n = var.nextInt();
        int r = var.nextInt();

        int result  = fact(n)/(fact(r)*fact(n-r));
        System.out.println(result);
    }
    
}
