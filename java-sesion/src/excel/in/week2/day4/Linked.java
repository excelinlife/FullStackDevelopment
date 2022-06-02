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
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
