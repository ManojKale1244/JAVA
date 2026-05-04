import java.util.*;

public class MaxWater {
    public static int MostWater(ArrayList<Integer> list){
        int max = 0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int ht = Math.min(list.get(i), list.get(j));
                int Width = j-i;
                int currWater = ht * Width;
               max = Math.max(max, currWater);
            }
            
        }
            return max;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
      System.out.println(MostWater(list));
    }
}
