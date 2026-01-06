import java.util.*;

public class condition{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 value :");
        int Num1 = sc.nextInt();
        System.out.print("Enter Num2 value :");
        int Num2 = sc.nextInt();

        if(Num1>Num2){
            System.out.println("The Num1 is greater : " + Num1);

        }

        else if(Num1 == Num2){
            System.out.println("Both are same value");
        }

        else{
            System.out.println("The Num2 is greater :" + Num2);
        }
        sc.close();
    }
}