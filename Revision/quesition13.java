import java.util.Scanner;

public class quesition13{
    public static int  LinearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== key){
                return i;
            }
        }
        return  -1;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,4,5,6,7,8,9};
        System.out.print("Enter a key :");

        int key = sc.nextInt();
        int index = LinearSearch(arr, key);

        if(index == -1){
           
            System.out.println("key not found");
        }
        else{
             System.out.println("key is found :" + index);
        }
        sc.close();

    }
    
}