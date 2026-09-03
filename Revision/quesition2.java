import java.util.Scanner;

public class quesition2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number :");
        int a = sc.nextInt();
        System.out.print("Enter a Second Number :");
        int b = sc.nextInt();
        System.out.print("Enter a Third Number :");
        int c = sc.nextInt();

        int AVG = (a + b + c)/3;

        System.out.print("The AVG is :" + AVG);

    }
}
