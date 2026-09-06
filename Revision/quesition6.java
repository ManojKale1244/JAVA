import java.util.Scanner;

public class quesition6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        int reverse = 0;
        while(num >0){
            int lastdig = num %10;
             reverse = (reverse * 10) + lastdig;

             num = num/10;

        }
        System.out.print(reverse);
        sc.close();
    }
    
}
