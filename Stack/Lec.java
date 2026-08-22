import java.util.*;
public class Lec {
    
    public static void main(String[] args){
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);

       
        
        while(!S.isEmpty()){
            System.out.println(S.peek());
            S.pop();
        }
    }
}
