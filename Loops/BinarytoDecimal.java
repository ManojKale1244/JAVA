import java.util.Scanner;

public class BinarytoDecimal {
    public static void BinTODeci(int n){
      int deci =0;
      int pow = 0;
      while(n>0){
        int LastDigit = n%10;
        deci = deci+LastDigit*(int)Math.pow(2, pow);
        pow++;
         n= n/10;
      }
      System.out.println(deci);
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        BinTODeci(num);
    }
}
