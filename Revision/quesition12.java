import java.util.Scanner;

public class quesition12{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int arr[] = new int[4];
       System.out.print("Enter your marks :");
       arr[0] = sc.nextInt();
       System.out.print("Enter your marks :");

       arr[1] = sc.nextInt();
       System.out.print("Enter your marks :");

       arr[2] = sc.nextInt();

       int sum = arr[0] + arr[1] + arr[2];
       System.out.println("The totle marks is :"+ sum);

    }
    
}