import javax.sound.sampled.SourceDataLine;

public class missing {
    public static int MissingElement(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1!=arr[i+1]){
                return arr[i]+1;
            }
           
        }
         return -1;
    }
    public static void main(String [] args){
       int arr[] = {1,2,3,4,5,7};
       System.out.println(MissingElement(arr));
        
    }
   
}
