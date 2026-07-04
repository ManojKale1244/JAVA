public class SecondL {
    public static void SecondLargest(int arr []){
     int max = arr[0];
     int sec = -1;
     for(int i=0;i<arr.length;i++){
        if(arr[i] > max){
            max = arr[i];
        }
       
     } 
        for(int i=0;i<arr.length;i++){
          if(arr[i] > sec && max!=arr[i]){
            sec = arr[i];
          }
        }
     System.out.println(sec);
    }
    public static void main(String[] args){
        int arr[] = {2,3,4,1,8,9,5};
        SecondLargest(arr);
    }
}
