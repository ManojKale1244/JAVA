public class SetBit {
    public static int Set(int n,int i){
        int BitMass = 1<<i;
        return n|BitMass;
    }

    public static void main(String[] args) {
       System.out.println(Set(10,2));
    }
}
