import java.util.*;
public class table{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :");
    int num = sc.nextInt();
    for(int i =num;i<=num*10;i= i+num){
       System.out.println(i);
    }
    sc.close();
   } 
}