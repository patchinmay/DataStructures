package com.projects;

public class LinkedList {

    Node head;

    public LinkedList() {
       // this.head = null;
    }

    void createList(int data){
        //this function is for creating the list
        Node node = new Node(data);
        if(head==null){
            head.next = node;
        }else{
            while(head.next!=null){
                head = head.next;
            }
            head.next = node;
        }

    }

    void printList(){
        int count = 0;
        while(head.next!=null){
            System.out.println("value at " + count +"position is:" +head.data);
            head = head.next;
            count++;
        }
    }

    public static void main(String[] args) {
	// Lets write the code for linked list
        LinkedList list = new LinkedList();

        list.createList(10);
        list.createList(11);
    }
}
