import java.util.*;
public class Sorting{
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(3);
    list.add(6);
    System.out.print(list);

    System.out.println();

    Collections.sort(list);
    System.out.print(list);

    System.out.println();
   Collections.sort(list, Collections.reverseOrder());
   System.out.print(list);
}
}
