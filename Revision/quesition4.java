import java.util.Scanner;

public class quesition4{
    public static void main(String [] main){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        while(num>=i){
            System.out.println("Hello World!");
            i++;
        }
  sc.close();
    }
    
}