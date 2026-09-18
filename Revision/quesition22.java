import java.util.Scanner;

public class quesition22 {
    public static void Palindrom(String word){
        for(int i =0;i<word.length();i++){
      if(word.charAt(i) == word.charAt(word.length()-i-1)){
        System.out.println("The given word is palindrom");
      }
      else{
        System.out.println("The given word is not palindrom");
      }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     System.out.print("Enter a word :");
    String word = sc.nextLine();
    Palindrom(word);
    sc.close();
    }
    
}
