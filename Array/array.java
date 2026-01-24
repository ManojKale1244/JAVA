import java.util.*;
public class array {
    public static void add(int marks[]){
        for(int i =0; i<marks.length;i++){
            marks[i] = marks[i]+1;
            System.out.println(marks[i]);
        }
    }

     public static void main(String[] args) {
        int mark[] = new int [3];
        mark[0] = 95;
        mark[1] = 96;
        mark[2] = 97;
        add(mark);

     }
}