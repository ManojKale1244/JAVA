public class Factorial {
    public static int Fac(int n){
        if(n==0){
            return 1;
        }
        int fnm1= Fac(n-1);
        int FF = n*fnm1;
        return FF;
    }
    public static void main(String[] args) {
       System.out.println(Fac(5)); 
    }
    
}
