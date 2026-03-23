public class Febunachi {
    public static int  PrintFeb(int n){
        if(n==0 || n==1){
       return n;
        }
        int fn1 = PrintFeb(n-1);
        int fn2 = PrintFeb(n-2);
        int Feb = fn1 + fn2;
        return Feb;
    }
    public static void main(String[] args) {
        System.out.println(PrintFeb(5));
    }
}
