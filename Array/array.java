import java.util.*;
public class array{
    public static void main(String[] args) {
        int marks[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics Marks :");
        marks[0] = sc.nextInt();
        System.out.print("Enter a Math Marks :");
        marks[1] = sc.nextInt();
        System.out.print("Enter a Chemistry marks :");
        marks[2] = sc.nextInt();
        System.out.println(marks[0] + " " + marks[1] + " " + marks[2]);
        sc.close();
    }
}