public class SelectionSort_1 {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minPos = i;
            for(int j= i;j<arr.length;j++){
                if(arr[minPos]> arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }
    public static void main(String[] args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
