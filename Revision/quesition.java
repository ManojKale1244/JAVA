import java.util.Scanner;

public class quesition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first numner :");
        int a = sc.nextInt();
         System.out.print("Enter a Second Number :");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("The gretest number is :" + a);
        }
        else{
            System.out.println("The gretest number is :" + b);
        }
    }
}
