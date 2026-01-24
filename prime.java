import java.util.*;
public class prime{

    public static boolean isprime(int n){
          if(n==1){
           
            return false;
          }
          else{
          for(int i =1; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                 System.out.println(i);
                return false;
            }
          }
          return true;
          }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println(isprime(num));
       sc.close();
    }
}