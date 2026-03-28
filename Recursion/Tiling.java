import java.util.*;
public class Tiling {
    public static int FindTiling(int n){
    if(n==0 || n==1){
        return 1;
    }
    int fnm1 = FindTiling(n-1);
    int fnm2 = FindTiling(n-2);
    int Total = fnm1 + fnm2;
return Total;     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n= sc.nextInt();
       System.out.println(FindTiling(n)); 
        sc.close();
    }
}
