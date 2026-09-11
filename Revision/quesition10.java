public class quesition10 {
    public static void Fact(int F){
       
        
        int f = 1;
        for(int i=1;i<=F;i++){
            f = f*i;
        }
        System.out.println(f);
    }
    public static void main(String [] args ){
      Fact( 5);
    }
}
