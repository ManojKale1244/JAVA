public class quesition16 {
    public static void ArrayReverse(int arr[]){
        int st = 0;
        int end = arr.length-1;
        while(st < end ){
            int temp = arr[end];
           arr[end]  = arr[st];

           arr[st] = temp;
           st++;
           end--;
        }
    }
    public static void main (String [] args){
        int arr [] = {1,2,3,4,5,6,7};
         ArrayReverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
