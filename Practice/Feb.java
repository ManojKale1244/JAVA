public class Feb {
    public static int Febunachi(int n){
        if(n==0 || n==1 ){
            return n;
        }
        int fnm1 = Febunachi(n-1);
        int fnm2 = Febunachi(n-2);
        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
       System.out.println(Febunachi(10));
    }
}
