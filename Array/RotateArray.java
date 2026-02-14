public class RotateArray {
    public static void Rotate(int arr[]){
  int temp = arr[0];
  int n= arr.length;
  for(int i=1;i<n;i++){
    arr[i-1] = arr[i];

  }
  arr[n-1] =temp;
    }
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5};
      Rotate(arr);
      for(int i=0;i<arr.length;i++){
        System.out.println("The rotate is " + arr[i]);
      }
    }
}
