import java.util.*;
public class Binomial{
    public static int Nfact(int n){
          int f = 1;
          
          for(int i = n; i>=1;i--){
           f = f*i;
           
         
          }
          return f;

    }
    public static int Rfact(int r){
    int f = 1;
    for(int i =r;i>=1;i--){
        f = f*i;
    }
    return f;

    }
    public static int NR(int n , int r){
        int f =1;
        for(int i =n-r; i>=1; i--){
            f = f*i;
        }


        return f;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       System.out.print("Enter  N value  :");
       int n = sc.nextInt();
       System.out.print("Enter R value :");
       int r = sc.nextInt();
       
       System.out.println("The Binomial Coefficient is :" + (Nfact(n)/(Rfact(r)*NR(n, r))));
       sc.close();
    }
}