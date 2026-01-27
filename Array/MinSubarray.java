public class MinSubarray {

    public static void SubArray(int arr[]){
        int Min = Integer.MAX_VALUE;
     for(int i=0; i<arr.length;i++){
        int start = i;
        for(int j=i;j<arr.length;j++){
          int end = j;
          int sum =0;
          for(int k=start;k<=end;k++){
            sum = arr[k];
          }
          System.out.println(sum);
          if(Min>sum){
            Min = sum;
          }
        }
     }
     System.out.println("The min value is : " + Min);
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        SubArray(arr);
    }
}
