import java.util.Scanner;

public class BinarytoDecimal {
    public static void BinTODeci(int n){
      int Bin =0;
      int pow = 0;
      while(n>0){
        int LastDigit = n%2;
        Bin = Bin+LastDigit*(int)Math.pow(10, pow);
        pow++;
         n= n/2;
      }
      System.out.println(Bin);
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        BinTODeci(num);
        sc.close();
    }
}
