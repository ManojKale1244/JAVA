public class Largest {
    public static void LargestElement(int arr[]){
    int max = Integer.MIN_VALUE;
    
    for(int i=0;i<arr.length;i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    System.out.println("The Largest Element is "+""+ max);
    }
    public static void main(String [] args){
        int arr[] = {8,2,3,5,1,9};
        LargestElement(arr);
    }
}
