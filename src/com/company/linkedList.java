package com.company;

public class linkedList {
    Node head;

    class Node{
        person person;
        Node next;
        Node prev;

        public Node(person person){
            this.person = person;
            this.next = null;
            this.prev = null;
        }

    }

    public void insert_first(person person){
        Node new_node = new Node(person);
        if (head == null){
            head = new_node;
        } else {
            new_node.next = head;
            head = new_node;
            new_node.prev = head;
        }
    }

    public void print_list(){
        while (head!= null){
            System.out.println(head.person.toString());
            head = head.next;
        }
    }

    public void InsertLast(person person){
        Node temp;
        temp = head;
        Node new_node = new Node(person);
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new_node;
    }

    public void reverse_list(){
        Node temp;
        temp = head;

        while (temp.next!= null){
            temp = temp.next;
        }
        while (temp!= null){
            System.out.println(temp.person.toString());
            temp = temp.prev;
        }
    }


}
