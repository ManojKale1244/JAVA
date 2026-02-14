import java.util.*;
public class Secondlarge {
    public static void Second(int arr[]){
        int Large = Integer.MIN_VALUE;
        int Sec = -1;

        for(int i=0;i<arr.length;i++){
            if(Large < arr[i]){
                Large = arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(Sec < arr[j] && Large !=arr[j]){
                Sec = arr[j];
               
            }
        }
 System.out.println("The Second Large number is :"+ " " + Sec );
    }
    public static void main(String[] args) {
        int arr [] = {1,2,4,7,7,5};
        Second(arr);
    }
    
}
