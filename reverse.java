import java.util.*;
public class reverse {
    public static void NumRev(int num){
       while (num>0) {
        int lastDigit = num%10;
        System.out.print(lastDigit + " ");
        num = num/10;
        
       }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number :");
        int Num = sc.nextInt();
        NumRev(Num);
        sc.close();

    }
    
}
