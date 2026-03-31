public class FriendPair {
    public static int Pair(int n){
     if(n==1|| n==2){
        return n;
     }
   return Pair(n-1) + (n-1) * Pair(n-2);
    }
    public static void main(String[] args) {
       System.out.println(Pair(4));
    }
}
