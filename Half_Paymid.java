import java.util.*;
public class Half_Paymid {

      public static void printStar(int totRows, int totCols){
        for(int i =1;i<=totRows;i++){
            for(int j =1; j<=totCols-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
       
      }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Rows number :");
        int Row = sc.nextInt();
        System.out.print("Enter your col :");
        int Col = sc.nextInt();
       printStar(Row, Col);
       sc.close();
    }
}
