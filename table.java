import java.util.*;

public class table {
    public static void tables(int n) {
        for (int i = n; i <= n * 10; i = i + n) {

            System.out.println(i);

        }

    }

    public static void main(String[] argsd) {
        System.out.print("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        tables(num);
        sc.close();
    }

}
