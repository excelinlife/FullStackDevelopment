package excel.in.week2.day4;

public class Linked {
    Node head;
    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.head=new Node(1);
        Node node2= new Node(2);
        Node node3= new Node(3);
        Node node4= new Node(4);
        linked.head.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;
        print(linked);
        System.out.println();
        insertAtBeg(linked, 70);
        print(linked);
        System.out.println();
        insertAtEnd(linked, 34);
        print(linked);
        System.out.println();
        insertAt(linked, 40,3);
        print(linked);
    }

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void print(Linked list){
        Node temp = list.head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void insertAtBeg(Linked list, int val){
        Node node =new Node(val);
        node.next=list.head;
        list.head=node;
    }

    public static void insertAtEnd(Linked list, int val){
        Node end = list.head;
        while (end.next!=null){
            end=end.next;
        }
        Node node =new Node(val);
        end.next=node;
        node.next=null;
    }

    public static void insertAt(Linked list, int val, int pos){
        Node node = list.head;
        int i=1;
        while (i<pos-1){
            node=node.next;
            i++;
        }
        Node newNode =new Node(val);
        newNode.next=node.next;
        node.next=newNode;
    }

}
