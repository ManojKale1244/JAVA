import java.util.*;
public class factorial{
    public static void fact(int a){
          int f = 1;
          for(int i = a; i>=1;i--){
           f = f*i;
           
         
          }
          System.out.println("The factorial is : " + f);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       System.out.print("Enter a number :");
       int num = sc.nextInt();
       
       fact(num);
       sc.close();
    }
}