// package 5.arrays;

public class binarysearch {
    public static void main(String[] args) {
        int array[] = {1,5,8,11,15,23,45,56,100};
        int mid ;
        int left = 0 ;
        int right = array.length-1 ;
        int key = 100;

        for(int i = 0 ;left <= right; i++){
            mid = (left+right)/2;
            if(array[mid] == key){
                System.out.println("found at position :" + (mid+1));
                break;
            }
            else if(key > array[mid]){
                left = mid +1 ;
            }
            else if(key < array[mid]){
                right = mid -1 ;

            }

        }

    }
    
}
