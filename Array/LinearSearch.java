import java.util.*;

public class LinearSearch {
    public static int Linear(String number[], String key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number[] = { "Vadapav", "bhel", "samosa" };
        System.out.print("Enter a value :");
        String key = sc.nextLine();
        int index = Linear(number, key);
        if (index == -1) {
            System.out.println("Not found Key");
        } else {
            System.out.println("Key is at index : " + index);
        }
        sc.close();

    }
}
