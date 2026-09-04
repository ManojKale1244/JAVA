import java.util.Scanner;

public class quesition3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a marks :");
        int marks = sc.nextInt();
        String result = (marks > 40)? "pass" : "fail";

        System.out.println(result);
        sc.close();

    }
}