import java.util.*;
public class Butterfly {
    public static void pattern(int n){
       
        for(int i =1;i<=n;i++){
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          for(int k =1;k<= 2*(n-i);k++){
            System.out.print(" ");
          }
             for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println();
        }
     
        
    }

    public static void pattern1(int n){
       
        for(int i =4;i>=1;i--){
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          for(int k =1;k<= 2*(n-i);k++){
            System.out.print(" ");
          }
             for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println();
        }
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number :");
    int Num = sc.nextInt();
    pattern(Num);
    pattern1(Num);
    sc.close();

   } 
}
