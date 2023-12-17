package org.example;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent(2);
        Child child = new Child(5);

        parent.method();
        child.method();
    }
}