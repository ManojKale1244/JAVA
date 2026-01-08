import java.util.*;
public class factorial{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :");

    int num = sc.nextInt();
    int F = 1;
     for(int i = num;i-1>0;i--){
        F = F*i;
       
     }
     System.out.println("The factorial is :" + F);
     
     sc.close();
    }
}