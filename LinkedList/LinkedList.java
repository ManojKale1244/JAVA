import java.util.*;
public class LinkedList {
   public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
   } 
   // Method
   public static Node head;
   public static Node tail;

   public void addFirst(int data){
    //step-1
    Node newNode = new Node(data);
    if(head == null){
        head = tail=newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
   }

   public void  addLast(int data){
    Node newNode = new Node(data);
    if(head ==null){
        head = tail=newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
   }
   public void Print(){
    Node Temp = head;
    while (Temp !=null) {
        System.out.print(Temp.data + "->");
        Temp=Temp.next;
        
    }
    System.out.println("null");
   }

   public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.Print();
     ll.addFirst(1);
     ll.Print();
     ll.addLast(2);
     ll.Print();
     ll.addLast(3);
     ll.Print();
     ll.addLast(4);
     ll.Print();

   }
}
