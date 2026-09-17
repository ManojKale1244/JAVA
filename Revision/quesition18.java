public class quesition18 {
    public static  void Subarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j= i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                   sum = sum + arr[k];
                }
                 System.out.println(sum);
                if(max < sum){
                    max = sum;
                }
               
            }
            System.out.print("The max value:" + max);
        }

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        Subarray(arr);

    }
}
