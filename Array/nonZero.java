import java.util.*;

public class nonZero {

    public static void findNonZero(int arr[]) {

        // Count non-zero elements
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }

        // Create new array of required size
        int temp[] = new int[count];
       

        // Copy non-zero elements
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }
         for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
        while(index < arr.length){
             arr[index] = 0;
             index++;
        }    
        
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3, 0, 4, 0, 5};
            
       findNonZero(arr);

       System.out.println(Arrays.toString(arr));
       

        
    }
}