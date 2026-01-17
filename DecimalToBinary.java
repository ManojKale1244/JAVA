import java.util.*;
public class DecimalToBinary {
    public static void deciTobin(int n){
        int pow =0;
        int binary = 0;
        while (n>0) {
        int rem = n%2;
        binary = binary + rem *(int)(Math.pow(10, pow));
        pow++;
        n = n/2;
        }
        System.out.print(binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int Num = sc.nextInt();
        deciTobin(Num);
        sc.close();
    }
    
}
