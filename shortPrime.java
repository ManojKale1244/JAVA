import java.util.*;

public class shortPrime {
    public static boolean isprime(int n){
       if(n == 2){
        return true;
       }
       for(int i =2; i<=Math.sqrt(n); i++){
        if(n%i == 0){
            return false;
        }
       }
       return true;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number :");
    int Num = sc.nextInt();
    System.out.println(isprime(Num));
    sc.close();
   } 
}
