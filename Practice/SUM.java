public class SUM {
    public static int  PrintSum(int n){
        if(n==0 || n==1){
     return n;
        }
        int Sum = PrintSum(n-1) + n;
        return Sum;
    }
    public static void main(String[] args) {
        System.out.println(PrintSum(10)); 
    }
}
