public class insertion {

    public static void main(String[] args) {
        int[] arr = {5,4,10,3,2};

        for(int i = 1 ; i < arr.length ; i++){
            int current = arr[i];
            int previous = i-1;
            while(previous >= 0 && arr[previous] >current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;

        }

        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}