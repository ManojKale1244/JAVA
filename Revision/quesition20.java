public class quesition20{
    public static void BubbleShort(int arr[]){
       int temp = 0;
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]> arr[j+1]){
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        
       } 
    }
    public static void main(String[] args){
        int arr[] = {5,3,6,8,4,2};
        BubbleShort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}