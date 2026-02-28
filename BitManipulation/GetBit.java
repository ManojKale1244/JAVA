
public class GetBit {
    public static int Binary(int n,int i){
       int bitMass = 1<<i;
        if((n & bitMass ) == 0){
           return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String [] args){
      System.out.println( Binary(4,2));
      System.out.println(Binary(5,3)); 

    }
}
