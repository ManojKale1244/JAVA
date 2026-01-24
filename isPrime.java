import java.util.*;

public class isPrime {
    public static void prime(int n) {
        boolean p = true;
        if (n == 1) {
            System.out.println("The given number is not prime :" + n);
        } else {

            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    p = false;
                }

            }

            if (p == true) {
                System.out.println("The given number is prime :" + n);
            }

            else {
                System.out.println("The given number is not prime : " + n);
            }

        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        prime(num);
        sc.close();
    }
}
