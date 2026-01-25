public class BinarySearch {
    public static int Search(int num[], int key){
            
            int end = num.length-1;
           for(int start =0;start<=end;){
            int mid = (start + end)/2;

            if(num[mid] == key){
                return mid;
            }
            if(num[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            
           }
           return -1;
    }
    public static void main(String[] args) {
      int arr[] = {2,4,6,8,10,12,14};
      int key = 10;
      System.out.println(Search(arr,key));
    }
}
