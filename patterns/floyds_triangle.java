import java.util.*;

public class floyds_triangle {  
    public static void Half_Pyramid(int n) {
        int count = 1;
        for(int i =1;i<=n;i++){
              
            for(int j =1;j<=i;j++){
               
                System.out.print(count + " ");
                count++;
            }
            for(int k =1;k<=n-i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter your numbber :");

        int Num = sc.nextInt();
        Half_Pyramid(Num);
        sc.close();
    }
}
