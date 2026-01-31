public class BubbleSort {
    public static void BubbleSorts(int arr[]){
        for(int i =0; i<arr.length-1;i++){
            int swap = 0;
            for(int j=0;j<arr.length-1-i;j++){
                if(swap == j){
                    if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                 
                }
                swap ++; 
                }
              
                
                
            }
              
        }
        System.out.print("sorted array :");

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        BubbleSorts(arr);
        for(int i =0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
       
    }
}

