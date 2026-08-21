import java.util.ArrayList;
public class Lec {
    static class Stack {
        static  ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //pop
        public static void push(int data){
          list.add(data);
        }

        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(int data){
            int top = list.get(list.size()-1);
            return top;
        }

    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek(0));
            s.pop();
        }
    }
}
