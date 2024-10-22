import java.util.*;
// public package conditional_statements;

public class if_else {
    public static void main(String[] args) {
        // int age = 5;
        // if (age> 18) {
        //     System.out.println("adult");
        // }
        // else{
        //     System.out.println("minor");
        // }

        // int a = 50 , b = 20;
        // if (a > b) {
        //     System.out.println("a is greater than b");
        //     }
        //     else if (a == b) {
        //         System.out.println("a is equal to b");
        //         }
        //         else{
        //             System.out.println("b is greater than a");
        //         }

        // Scanner var = new Scanner(System.in);
        // System.out.println("Enter your num:");
        // int num = var.nextInt();

        // if(num%2 == 0){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }

    //     Scanner var = new Scanner(System.in);
    //     System.out.println("Enter your InCOME:");
    //     int income  = var.nextInt();

    //     if(income < 500000){
    //         System.out.println("you have no tax");
    //     }
    //     else if(income > 500000 && income <1000000){
    //         System.out.println("your tax ammount is: " + income*0.1);
    //     }
    //     else{
    //         System.out.println("your tax ammount is :" + income*0.3);
    //     }
        Scanner var = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = var.nextInt();
        System.out.println("Enter 2nd number");
        int b = var.nextInt();
        System.out.println("Enter 3rd number");
        int c = var.nextInt();

        if(a > b && a > c ){
            System.out.println(a + " is greater");
        }
        else if(b > a && b > c){
            System.out.println(b + " is greater");
        }
        else{
            System.out.println(c + " is greater");
        }
    }

    
}