import java.util.ArrayList;

public class MultiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList <Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list1.add(5);
            MainList.add(list1);

            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(2);
            list2.add(4);
            list2.add(6);
            list2.add(8);
            list2.add(10);
            MainList.add(list2);

                        ArrayList<Integer> list3 = new ArrayList<>();
            list3.add(3);
            list3.add(6);
            list3.add(9);
            list3.add(12);
            list3.add(15);
            MainList.add(list3); 

            for(int i=0;i<MainList.size();i++){
                ArrayList<Integer> CurrList = MainList.get(i);
                for(int j=0;j<CurrList.size();j++){
                    System.out.print(CurrList.get(j)+ " ");
                }
                System.out.println();
            }
    }
}
