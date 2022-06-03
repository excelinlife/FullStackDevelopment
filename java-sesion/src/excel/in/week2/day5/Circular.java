package excel.in.week2.day5;

import excel.in.week2.day4.Linked;

public class Circular {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Circular list = new Circular();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=list.head;
        print(list);
    }


    public static void print(Circular list){
        Node temp = list.head;
        System.out.println(temp.data);
        temp =temp.next;
        while (temp!=list.head){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
