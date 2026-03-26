public class FindArray {
    public static int FindArry(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return 1;
        }
        return FindArry(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,7,3,9};
      System.out.println(FindArry(arr, 0, 5));
    }
}
