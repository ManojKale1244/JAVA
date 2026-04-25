
public class ArrayBacktracking {


public static void ChangArray(int arr[], int i,int val){

if(i==arr.length){
   PrintArray(arr);
   return;
}


   arr[i] = val;
   ChangArray(arr, i+1, val+1);
   
   arr[i] = arr[i]-2;
      


}
   public static void PrintArray(int arr[]){
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      int arr[] = new int[5];
      ChangArray(arr,0,1);
      PrintArray(arr);
   }
}
