import java.util.*;

public class SubString {
    public static String Search(String ch, int st,int end){
        String sum = "";
        for(int i = st;i<end;i++){
          sum+= ch.charAt(i);

        }
      return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = sc.nextLine();
        System.out.println(Search(str,0,3));
        sc.close();
    }
}
