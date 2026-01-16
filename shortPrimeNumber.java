import java.util.*;

public class shortPrimeNumber {
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeNum(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }

        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :"); 
        int Num = sc.nextInt();
        primeNum(Num);
        sc.close();
    }
}
