import java.util.*;
public class Half{
     public static void pyramid(int totRows, int totCols){
        for(int i =1;i<=totRows;i++){
            for(int j =1;j<=totCols-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Rows number :");
        int Row = sc.nextInt();
        System.out.print("Enter your cols number :");
        int Cols = sc.nextInt();
        pyramid(Row, Cols);
        sc.close();

    }
}