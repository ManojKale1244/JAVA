public class SubArray_1 {
    public static void SubofSum(int arr[]){
       int Max = Integer.MIN_VALUE;
       int sum =0;
        for(int i=0;i<arr.length;i++){
             
            for(int j=0;j<arr.length-1;j++){
               
            
            for(int k=i;k<=j;k++){
             if(sum > Max){
                sum += arr[k];
             }

            }
        }
         
        }
       System.out.println(sum);

    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,1,1,1,1,4,2,3};
      SubofSum(arr);
    }
}
