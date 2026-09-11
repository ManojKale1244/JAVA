import java.util.Scanner;

public class quesition11 {

    public static void BinarytoDecimal(int n){
        int pow =0;
        int decimal = 0;
        while(n>0){
            int lastdigit = n%10;
            decimal = decimal + lastdigit * (int)(Math.pow(2, pow));
            pow++;
            n= n/10;

        }
        System.out.println(decimal);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        BinarytoDecimal(n);

    }
}
