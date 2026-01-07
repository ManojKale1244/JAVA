import java.util.*;
public class sum_natural{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int i =1;
        int sum = 0;
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        while(i<=num){
       System.out.println(i);
       sum = sum+i;
       i++;
        }
        System.out.println("The total sum is :" + sum);
        sc.close();
    }
}