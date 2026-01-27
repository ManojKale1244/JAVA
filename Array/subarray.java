public class subarray {
    public static void SubaArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            int start = i;
            int sum =0;
            int max = Integer.MIN_VALUE;
            for(int j=0; j<arr.length;j++){
                int end = j;
                 
                for(int k = start;k<=end;k++){
                    System.out.print(arr[k] + " ");
                    if(sum>max){
                       sum = arr[k]+sum;
                    }
                    
                    

                }
                
                System.out.println();
               
            }
            System.out.println();
            
                
                System.out.println(" The Sum is :" + sum);
            

        }
       

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        SubaArr(arr);
        
    }
}
