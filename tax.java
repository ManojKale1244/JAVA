import java.util.*;
public class tax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income Amount :");
        int income = sc.nextInt();
      
        if(income<500000){
            System.out.println("0% tax :" + income*0 );
        }

        else if(income<1000000 && income>500000){
            System.out.println("20% Tax :" + (income*20)/100);
        }
        else{
            System.out.println("30% Tax :" + (income*30)/100);  
        }
        sc.close();
    }
}
