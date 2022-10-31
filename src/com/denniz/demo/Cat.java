package com.denniz.demo;

public class Cat implements IAnimal {

    String name;
    @Override
    public void speak() {
        System.out.println("Meow meow");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
