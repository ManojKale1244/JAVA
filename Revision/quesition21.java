public class quesition21 {
    public static void SelectionSort(int arr[]){
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
            int minpos = i;
        for(int j=i+1; j<arr.length;j++){
            if(arr[minpos] > arr[j]){
                minpos = j;
            }
        }
        temp = arr[minpos];
        arr[minpos] = arr[i];
        arr[i] = temp;
        }
    }
    public static void main(String [] args){
        int arr[] = {3,5,6,3,1};
        SelectionSort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
