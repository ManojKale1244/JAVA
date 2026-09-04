import java.util.Scanner;

public class quesition5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        while(num > 0){
          int   lastdigi = num %10;
          System.out.print(lastdigi);
          num = num/10;
        }
        sc.close();
    }
}
