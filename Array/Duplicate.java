public class Duplicate {
    public static int DuplicateFind(int arr[]){
       int i =0;
       
       for(int j=1;j<arr.length;j++){
       if(arr[j] != arr[i]){
        i++;
        arr[i] = arr[j];
       }

        }
       
      return i+1;
     
       
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3};
        System.out.print("The toale number is :");
     int sort = DuplicateFind(arr);

     System.out.println(sort);
     for(int i=0;i<sort;i++){

          System.out.println("The array is :"+ arr[i]);
     } 
       
    }
}
