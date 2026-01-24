
public class array {
    public static void add(int marks[]){
        int key = 10;
        for(int i =0; i<marks.length;i++){
            if(marks[i]==key){
               System.out.println("Find the key value :" + i);
               break;

            }
          
           
        }
    }

     public static void main(String[] args) {
        int mark[] = new int [8];
        mark[0] = 2;
        mark[1] = 4;
        mark[2] = 6;
        mark[3] = 8;
        mark[4] = 10;
        mark[5] = 12;
        mark[6] = 14;
        mark[7] = 16;
        add(mark);

     }
}