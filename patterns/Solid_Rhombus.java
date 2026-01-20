import java.util.*;
public class Solid_Rhombus{
    public static void pattern(int n){
       for(int i=1;i<=n;i++){
        for(int j =1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int k =1 ; k<=n;k++){
            System.out.print("*");
        }
        for(int l =1;l<=1-i;l++){
            System.out.print(" ");
        }
        System.out.println();
       }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :");
    int num = sc.nextInt();
    pattern(num);
    sc.close();
}
}