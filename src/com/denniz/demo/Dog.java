package com.denniz.demo;

public class Dog implements IAnimal {

    String name;

    @Override
    public void speak() {
        System.out.println("Woof woof, bark bark bork");
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