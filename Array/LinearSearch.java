import java.util.*;
public class LinearSearch {
    public static int Linear(int number[],int key){
        for(int i =0;i<number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {2,4,6,8,10,12,14,16};
        System.out.print("Enter a key value :");
        int key =sc.nextInt();
        int index = Linear(number,key);
        if(index == -1){
            System.out.println("Not found Key");
        }
        else{
            System.out.println("Key is at index : " + index);
        }


    }
}
