import java.lang.annotation.Target;
import java.util.*;

public class FindTarget {
    public static boolean Ftarget(ArrayList<Integer>list, int Target){
        boolean Sum = false;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                  if(list.get(i) + list.get(j)==Target){
                       return true;
                  }
            }
             
        }
       return Sum;
       
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int Target = 16;
         System.out.println(Ftarget(list, Target));
    }
}
