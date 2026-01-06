import java.util.*;
public class po_ne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value :");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("The given number is negative :" + num);

        }
        else{
            System.out.println("The given number is positive :" + num);
        }
        sc.close();
    }
}