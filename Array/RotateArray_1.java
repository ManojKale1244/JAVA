public class RotateArray_1 {
    public static void Rotate(int arr[]){
        int tem [] = {1,2,3};
        int n = arr.length;
        for(int i =0; i<n;i++){
            arr[n-3] = arr[i];
        }
        
    }
    public static void main(String[] args) {
        
    }
}
