public class Sum {
    public static int PrintSum(int n){
        if(n==0){
            return 0;
        }
        
        int N = PrintSum(n-1);
        int Sum = N+n;
        return Sum;

    }
    public static void main(String[] args) {
        System.out.println(PrintSum(10));
        
    }
}
