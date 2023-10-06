package linkedlist;

public class doubly {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node end = null;

    public void createlist(int a) {
        Node newnode = new Node(a);
        if (head == null) {
            head = newnode;
            end = newnode;
            head.prev = null;
        } else {
            end.next = newnode;
            newnode.prev = head;
            end = newnode;
        }

    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null\n");
    }

    public void insertfirst(int a) {

        Node newhead = new Node(a);
        if (head == null) {
            head = newhead;
        } else {
            newhead.next = head;
            newhead.prev = null;
            head.prev = newhead;
            head = newhead;
        }

    }

    public void insertionatpo(int a, int b) {
        Node curr = head;
        Node newnode = new Node(a);
        int count = 1;
        while (curr != null) {

            curr = curr.next;
            count = count + 1;
            if (count == b) {
                newnode.next = curr;
                newnode.prev = curr.prev;
                curr.prev.next = newnode;
                curr.prev = newnode;
            }
        }
    }

    public void deletion(int a){
        Node curr = head;
        int count = 1;
        while(curr!=null){
           count++;
           curr = curr.next;
           if(count==a){
               curr.prev.next = curr.next;
               curr.next.prev = curr.prev;
           }
        }
    }
    public static void main(String arr[]) {
        doubly li = new doubly();
        li.createlist(10);
        li.createlist(11);
        li.createlist(12);
        li.createlist(13);
        li.createlist(17);
        li.display();
        li.insertfirst(55);
        li.display();

        li.insertionatpo(65, 3);
        li.display();
        li.deletion(4);
        li.display();
    }
}
