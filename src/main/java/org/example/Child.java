package org.example;

public class Child extends Parent{
    public Child(int a) {
        super(a);
    }

    @Override
    public void method()
    {
        System.out.println("Method in child class");
    }
}
