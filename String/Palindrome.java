import java.util.Scanner;
public class Palindrome {
    public static boolean PallindromOfString(String word){
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i) == word.charAt(word.length()-i-1)){
                System.out.println("The given word is pallindrom");
                return true;
            }
        }
        System.out.println("The given word is not palindrom");
        return false;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word :");

    String word = sc.nextLine();
    PallindromOfString(word);
  }  
}
