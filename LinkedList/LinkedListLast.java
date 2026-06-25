import java.util.*;
public class LinkedListLast {
   public static class Node {
     int data;
     Node next;

     public  Node(int data){
        this.data = data;
        this.next = null;

     }

   } 
   public static Node head;
   public static Node tail;
   public static int Size;

   public void addLast(int data){
      Node newNode = new Node(data);
      Size++;
      if(head == null){
         head = tail = newNode;
         return;
      }
      tail.next = newNode;

      tail = newNode;
   }
   public void add(int index, int data){
    Node newNode = new Node(data);
    Size++;
    Node temp = head;
    int i=0;
    while(i < index-1){
        temp = temp.next;
        i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;

   }
   public void print(){
    Node temp = head;

    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }

    System.out.println("null");
}

public int remove(){
   if(Size == 0){
      System.out.println("LL is Empty");
         return Integer.MIN_VALUE;
   }
   else if(Size == 1){
      int val = head.data;
      head = tail= null;
      Size =0;
       return val;

   }
     int val = head.data;
     head = head.next;
     Size--;
     return val;

}
public int Removelast(){
   if(Size == 0){
      System.out.println("LL is empty");
   return Integer.MIN_VALUE; 
   }
   else if(Size ==1){
      int val = head.data;
      head = tail = null;
      Size = 0;
      return val;

   }
   Node prev = head;
   for(int i=0; i<Size-2;i++){
      prev = prev.next;
   }

   int val = prev.next.data;
   prev = prev.next;
   tail = null;
   Size--;
   return val;
}

  public int search(int key){
   Node temp = head;
   int i=0;
   while (temp != null) {
      if(temp.data == key){
         return i;
      }
      temp = head.next;
      i++;
      
   }
   return -1;

  }
  public void reverse(){
   Node prev = null;
   Node curr = tail = head;
   Node next;
   while(curr != null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;

   }
   head = prev;
  }
   public static void main(String[] args){
    LinkedListLast ll = new LinkedListLast();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);    
    ll.add(2, 10);
    ll.print();
    ll.reverse();
    ll.print();
     
   }  
}
