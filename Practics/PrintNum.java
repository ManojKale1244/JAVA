
import java.util.*;
public class PrintNum {
    public static void PrintNumber(int n){
        if(n==1){
            System.out.println(n + " ");
              return;
        }
       PrintNumber(n-1);
        System.out.println(n);

    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :");
    int num = sc.nextInt();
    PrintNumber(num);
  }  
}
