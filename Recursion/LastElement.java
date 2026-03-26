public class LastElement {

    public static int LastElement(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = LastElement(arr, i+1, key);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
     public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3,2,1,9};
        System.out.println(LastElement(arr, 0, 2));
     }
}