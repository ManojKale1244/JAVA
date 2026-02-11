import java.util.*;
public class Find2DArray {
    public static boolean Search(int arr[][],int key){
         int n = arr.length;
        int m = arr[0].length;
        System.out.print("Enter a number : ");
        for(int i =0;i<n;i++){
            for(int j=0; j<m;j++){
                if(arr[i][j] == key){
                    System.out.print("The key is :" + " " + i + " " + j + " ");
                    return true;
                }
            }
        }
        System.out.print("Key is Not Found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int n = arr.length;
        int m = arr[0].length;
        System.out.print("Enter a number : ");
        for(int i =0;i<n;i++){
            for(int j=0; j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i =0 ; i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(arr[i][j] + " "); 
            }
            System.out.println();
        }
        Search(arr, 5);
        sc.close();
    }
}
