import java.util.*;

public class LinkedList1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //method
    public static Node head;
    public static Node tail;

    // Method

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail=newNode;
            return;

        }

        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx , int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i =0;
        while (i < idx-1) {
            temp = temp.next;
            i++;
            
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int RemoveFirst(){
        int val = head.data;
        head = head.next;
        return val;
    }

    public void Print(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
          
        ll.addFirst(1);
       
        ll.addLast(2);
        
        
        
        ll.addLast(3);
       
        ll.addLast(4);

        ll.add(2,0);
        ll.RemoveFirst();
        ll.Print();
    }

}
