import java.util.*;

public class zero_oneTriangle {
    public static void pattern(int n) {
      
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
             if ((i+j) % 2 == 0) {
                System.out.print("1");
            }
            else{
               System.out.print("0");
            }
              
            }
            for (int k = 0; k <= n - i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int Num = sc.nextInt();
        pattern(Num);
        sc.close();
    }
}
