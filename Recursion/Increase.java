public class Increase {
 public static void PrintNum(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    PrintNum(n-1);
    System.out.println(n+" ");

 }
    public static void main(String[] args) {
        
        PrintNum(10);
    }
}
