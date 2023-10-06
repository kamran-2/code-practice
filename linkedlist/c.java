package linkedlist;
  



class Node{
    int data;
    Node next;
    
    Node(int data){
       this.data = data;
    }
    
  }
   class c{
    public static void display(Node head){
        int count = 0;
         while(head!=null){
             count++;
             System.out.print(head.data + "--->");
             head = head.next;
         }
         System.out.println("\n Length of List : "+count);
    }
    class A{
      public static void main(String arr[]){
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d  = new Node(8);
        Node e  = new Node(9);
        a.next = b; 
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);


    }
 }
   
}
