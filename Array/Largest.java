import java.util.*;
public class Largest{
   
        public static int LargestNumbers(int num[]){
            int largest = Integer.MIN_VALUE;
           
           for(int i=0;i<num.length;i++){
            if(largest<num[i]){
            largest= num[i];
           }
         }
                 return largest;

      }

     public static void main(String[] args){
      int arr[] = {1,2,6,3,5};
    
      System.out.println("The largest number is :" + LargestNumbers(arr));
      
   }
     
}