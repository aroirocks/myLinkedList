package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        person p1 = new person("Amit","Developer",1000);
        person p2 = new person("Sarah","Junior Developer",7000);
        person p3 = new person("Sam","Senior Developer",3000);
        person p4 = new person("Alekhya","Process leader",10000);
        person p5 = new person("Peter","Trader",12000);

        linkedList linkedList = new linkedList();
        linkedList.insert_first(p1);
        linkedList.insert_first(p2);
        linkedList.insert_first(p3);
        linkedList.insert_first(p4);
        linkedList.insert_first(p5);

//        linkedList.InsertLast(p4);

        linkedList.print_list();
//        linkedList.reverse_list();
        
    }
}
