import java.util.*;

public class palindrome {
    public static void ispalindrome(int n){
          int rev = 0;
          int N = n;
     while(n>0){
        int mod = n%10;
        rev = rev *10 + mod ;
        n = n/10;
     }
    
       if(rev==N){
        System.out.println("The given number is palindrome ");
       }
       else{
           System.out.println("The given number is not palindrome ");
       }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int Num = sc.nextInt();
        ispalindrome(Num);
        sc.close();

    }
}
