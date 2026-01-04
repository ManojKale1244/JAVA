import java.util.*;
public class GST {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Pencil value :");
      float pencil = sc.nextFloat();
      System.out.print("Enter Pen value :");
      float pen = sc.nextFloat();
       System.out.print("Enter Eraser value :");
       float eraser = sc.nextFloat();
       float GST = ((pencil+pen+eraser)*18)/100;
       System.out.println((pencil+pen+eraser)+GST);
       sc.close();

    }
}
