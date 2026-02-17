import java.util.*;
public class BasicString {
    public static void string(String name){
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        string(name);
    }
}
