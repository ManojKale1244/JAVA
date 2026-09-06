import java.util.Scanner;

public class quesition8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                isprime = false;
            }
    
        }
         if(isprime == true){
            System.out.print("The given number is prime");

        }
        else{
            System.out.print("The given number is not prime ");
        }
    }
}
