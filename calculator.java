import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter oprant :");
        int a = sc.nextInt();

        System.out.print("Enter oprator :");
        String op = sc.next();

        System.out.print("Enter oprant :");
        int b = sc.nextInt();

        switch (op) {
            case "+":
                System.out.println(a + b);

                break;

            case "-":
                System.out.println(a - b);

                break;

            case "*":
                System.out.println(a * b);

                break;

            case "/":
                System.out.println(a / b);

                break;

            case "%":
                System.out.println(a % b);

                break;

            default:
                System.out.println("Try again");

        }
    }
}