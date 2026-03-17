public class claculator {
    public static void main(String[] args) {
      claculators C = new claculators();  

      System.out.println(C.sum(1,3));
      System.out.println(C.sum((float)2.5,(float)1.5));
      
    }

}

class claculators{
      int sum(int a, int b){
        return a + b;
      }
      float sum (float a, float b){

      return a + b;
    }
    int sum (int a, int b, int c){
        return a + b + c;
    }
}