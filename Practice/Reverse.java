package Practice;

import java.util.*;
public class Reverse {
    public static void PrintNumber(int n){
        if(n==1){
            System.out.println(n + " ");
            return;
        }
        System.out.println(n);
        PrintNumber(n-1);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Number :");
       int Num = sc.nextInt(); 
       PrintNumber(Num);
    }
}
