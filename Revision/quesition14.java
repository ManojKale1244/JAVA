public class quesition14{
    public static int LargestNo(int arr[]){
        int Large = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(Large < arr[i]){
                Large = arr[i];
            }
           
        }
         return  Large;
    }
public static void main(String [] args){
    int arr[] = {2,3,5,1,7,1,4};
    System.out.println(LargestNo(arr));

}

}