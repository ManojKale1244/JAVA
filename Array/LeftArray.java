public class LeftArray {
    public static void Rotate(int arr[]){
        int n = arr.length;
        int d = 3;
        int temp[] = {1,2,3};
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        for(int j=n-d;j<n;j++){
         arr[j] = temp[j-(n-d)];
        
         
        }


    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Rotate(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
