
public class SortedArray {
    public static boolean Sorted(int arr[]){
        for(int i =1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                System.out.println("The given Array is not Sorted");
                return false;
            }
            
        }
        System.out.println("The given Array is  Sorted");
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        Sorted(arr);
    }
    
}
