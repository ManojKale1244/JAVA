import java.util.*;
public class pro{
    public static void product(int a, int b){
           int pro = a*b;
           System.out.println( "The product :" + pro);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a first number :");
      int a = sc.nextInt();
      System.out.print("Enter a second number :");
      int b = sc.nextInt();
       product(a,b);
       sc.close();

    }
}