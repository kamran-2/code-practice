package linkedlist;

class A {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node end = null;

    public void createlist(int a) {

        Node newnode = new Node(a);
        if (head == null) {
            head = newnode;
            end = newnode;
        } else {
            end.next = newnode;
            end = newnode;
        }

    }

    public void displaylist() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print("null \n");
    }

    public void addfirst(int a) {

        Node newnode = new Node(a);
        if (head == null) {
            head = newnode;

        } else {
            newnode.next = head;
            head = newnode;
        }

    }

    public void addbetween(int a, int b) {
        Node curr = head;
        Node nextnode = head.next;
        Node newnode = new Node(b);
        while (nextnode != null) {

            if (curr.data == a) {
                curr.next = newnode;
                newnode.next = nextnode;
                return;
            }
            curr = curr.next;
            nextnode = nextnode.next;

        }
    }

    public static void main(String arr[]) {
        A li = new A();

        li.createlist(1);
        li.createlist(2);
        li.createlist(3);
        li.createlist(4);
        li.createlist(5);
        li.displaylist();
        li.addfirst(0);
        li.displaylist();
        li.addbetween(2, 11);
        li.displaylist();

    }

}
