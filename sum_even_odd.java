import java.util.*;
public class sum_even_odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int even = 0;
       int odd = 0;
        do{
            System.out.print("Enter a number :");
            int n = sc.nextInt();
            if(n%2 ==0){
                even = even+n;
               System.out.println("The sum of even number :" + even);
            }
            else{
                odd = odd+n;
                 System.out.println("The sum of odd number :" + odd);
            }

        }while(true);
     
        
    }
}