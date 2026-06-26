import java.util.*;
public class Que{

public static int Fctorial(int n){
    int F=1;
   for(int i=n;i>=1;i--){
     F = F*i;
   }
  return F;
}

public static int Factorial1(int n){
    int i=n;
    int F=1;
    while(i>=1){
        F = F*i;
        i--;
    }
return F;
}
public static void main(String [] args){
    System.out.println(Fctorial(5));
    System.out.println(Factorial1(5));
  
}
}