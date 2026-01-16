import java.util.*;
public class binaryTodecimal{
    public static void binTodeci(int n){
        int pow = 0;
        int decimal = 0;
        while (n>0) {
            int LastDigit = n%10;
            decimal = decimal + LastDigit * (int) Math.pow(2, pow);
            pow++;
            n = n/10;

            
        }
        System.out.print(decimal);

    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a binary number :");
      int Num = sc.nextInt();
      binTodeci(Num);
      sc.close();
    }
}