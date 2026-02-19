import java.util.*;
public class Vowels {
    public static void lowercase(String str){
         int count = 0;
        for(int i =0; i<str.length();i++){
           
            char ch = str.charAt(i); 
            if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
               
            }
        }
         System.out.println("The Count of lowercase vowels is :" +count);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a String :");
       String str = sc.nextLine();
        lowercase(str);
        sc.close();
    }
}
