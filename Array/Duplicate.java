public class Duplicate {
    public static void DuplicateFind(int arr[]){
       int i =0;
       
       for(int j=1;j<arr.length;j++){
       if(arr[j] != arr[i]){
        arr[i+1] = arr[j];
        
         System.out.println(arr[i]);
         i++;
       }

        }
      
     
       
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,4};
        DuplicateFind(arr);
       
    }
}
