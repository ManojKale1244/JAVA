public class quesition24 {
    public static void Recursition(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        Recursition(n-1);
        System.out.print(n + " ");
    }
    public static void main(String [] main){
        int n = 10;
        Recursition(n);

    }
}
