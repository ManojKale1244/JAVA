public class SortedMatrix {
    public static boolean Search(int arr[][],int key){
    int row =0;
    int col = arr[0].length-1;
    while (row<=arr.length && col>=0) {
        if(arr[row][col]==key){
            System.out.println("The is Found :" + row + " " + col);
            return true;
        }
        else if(key<arr[row][col]){
            col--;

        }
        else{
            row++;
        }
        
    }
    System.out.println("The Key is not Found");
     return false;
     
    }
    public static void main(String[] args) {
       int arr[][]= {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
       Search(arr,39);
    }
}
