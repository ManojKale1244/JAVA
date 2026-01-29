public class Kadanes{
    public static void kadanesArray(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum<0){
                sum = 0;
            }
            max = Math.max(sum, max);
        }
      System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanesArray(arr);
        
        
    }
}