public class Basic {
    public static  class Node{
        int data;
        Node next;
        public  Node(int data){
        this.data = data;
        this.next = null;
    }
      
    }
    public static Node head;
    public static Node tail; 

    public void firstadd(int data){
        Node newNode = new Node(data);
        if(head  == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }
          
        tail.next = newNode;
       tail = newNode;

    }
   

    public void addMiddle(int data,int index){
        if(index==0){
            firstadd(data);
            return;
        }
        Node newNode = new Node(data);
        int i=0;
        Node temp = head;
        while(i<index-1){
        temp = temp.next;
        i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;


    }
    public int keyFind(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
             if(key == temp.data){
                return i;
             }
             temp = temp.next;
             i++;
        }
        return -1;
    }
    public static void main(String [] args){
     Basic ll = new Basic();
      ll.firstadd(2);
    
      ll.firstadd(1);
      ll.addLast(3);
      ll.addLast(4);
        ll.addMiddle(5,2);
       System.out.println("The index value is :" + ll.keyFind(5));
       
      Node temp = head;
      while(temp !=null){
        System.out.println(temp.data);
        temp = temp.next;

      }
      
    
    }
}
