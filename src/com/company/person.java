package com.company;

public class person {
    String name;
    String occupation;
    int balance;

    public person(String name, String occupation, int balance) {
        this.name = name;
        this.occupation = occupation;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", balance=" + balance +
                '}';
    }
}
