import java.util.*;
public class smallest {
    public static int Small(int num[]){
        int small = Integer.MAX_VALUE;
        for(int i=0;i<num[i];i++){
            if(small>num[i]){
                small = num[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
       int num[] =  {4,7,8,3,2,5,6,9}; 
      System.out.println("The smallest number is :" +Small(num));
    }
    
}
