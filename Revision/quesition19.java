public class quesition19{
    public static void Kadans(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        Kadans(arr);

    }
}