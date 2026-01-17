import java.util.*;
public class Even {
    public static boolean isEven(int n){
       if(n%2 !=0){
        return false;
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int Num = sc.nextInt();
        System.out.println(isEven(Num));
        sc.close();
    }
}
