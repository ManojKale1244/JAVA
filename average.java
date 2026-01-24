import java.util.*;

public class average {
    public static void avg(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.println("The averge of three number is :" + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number :");
        int a = sc.nextInt();
        System.out.print("Enter your 2nd number :");

        int b = sc.nextInt();
        System.out.print("Enter your 3rd number :");

        int c = sc.nextInt();
        avg(a, b, c);
        sc.close();
    }
}
