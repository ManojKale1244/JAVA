public class SortedArray {
    public static boolean Sort(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return Sort(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,5};
       System.out.println( Sort(arr, 0));

        
    }
}
