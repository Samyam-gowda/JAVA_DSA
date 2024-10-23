public class selection {
    public static void main(String[] args) {
        int arr[] = {5,4,10,3,2};

        for(int i = 0 ;i < arr.length ; i++){
            int min_inx = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[min_inx] > arr[j]){
                    min_inx = j;
                }
                int temp = arr[min_inx];
                arr[min_inx] = arr[i];
                arr[i] = temp;
        }
    }
    for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i] + " ");
    }
    
}
}
