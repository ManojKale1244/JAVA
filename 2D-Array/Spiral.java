
public class Spiral {
    public static void spiral(int arr[][]){
      int startRow = 0;
      int startCol = 0;
      int endRow = arr.length-1;
      int endCol = arr.length-1;
      while(startRow<= endRow && startCol<=endCol){

      
      //Top
      for(int j=startCol;j<=endCol;j++){
        System.out.print(arr[startRow][j]+" ");
      }  

      //Right
      for(int i=startRow+1;i<=endRow;i++){
        System.out.print(arr[i][endCol]+" ");
      }

      //Bottom
      for(int i=endCol-1;i<=startCol;i--){
        if(startRow == endCol){
            break;
        }
        System.out.println(arr[endRow][i]+" ");

      }
      // left
      for(int j=endRow-1;j>=startRow+1;j--){
        if(startCol == endCol){
            break;
        }
      System.out.print(arr[endRow][j]+" ");
      }
      startCol++;
      startRow++;
      endRow--;
      endCol--;

      }
      System.out.println();


    }
    public static void main(String[] args) {
    
       int arr[][] = {
       {1,2,3,4},
       {5,6,7,8},
       {9,10,11,12},
       {13,14,15,16}
    };
       spiral(arr);
    }
}
