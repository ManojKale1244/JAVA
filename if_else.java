import java.util.*;

public class if_else {
   public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Value :");
    int Num = sc.nextInt();
    if(Num%2 == 0){
        System.out.println("The given number is even :" + Num);
    }
    else{
        System.out.println("The given number is odd :" + Num);
    }
    sc.close();
   } 
}
