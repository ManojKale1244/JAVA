
public class Factorial {
    public static int factorial(int n){
        if(n==1 || n==0){
         return 1;
        }
        int fnm1 = factorial(n-1);
        int fc = n * fnm1;
        return fc;
    }
  public static void main(String[] args) {
    System.out.println(factorial(5));
  }  
}
