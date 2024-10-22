// package 5.arrays;

import java.util.Scanner;

public class Arrays {

    public static int largest(int[] array){
        int largest = array[0];
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] > largest){
                largest = array[i];
            }

        }
        return largest;
    }
    public static void main(String[] args) {
        
        // int array[] = new int[10];
        // Scanner var  = new Scanner(System.in);
        // for(int i = 0 ; i < array.length ; i++){
        //     array[i] = var.nextInt();
        // } 
        // for(int i = 0 ;i < array.length ; i++){
        //     System.out.println(array[i]);
        // }


        int array[] = {250,34,23,56,89,71};
        System.out.println(largest(array));


    }
    
}
