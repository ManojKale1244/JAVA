import java.util.*;

public class InHalf_pyramid {
    public static void Half_Pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int Num = sc.nextInt();
        Half_Pyramid(Num);
        sc.close();

    }
}
