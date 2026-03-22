public class ClearBit {
    public static int Clear(int n,int i){
        int BitMass = ~(1<<i);
        return n & BitMass;
    }
    public static void main(String[] args) {
       System.out.println( Clear(10, 1));
    }
}
