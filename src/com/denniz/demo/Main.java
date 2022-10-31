package com.denniz.demo;

public class Main {
    public static void main(String[] args){

        //Instantiate Objects
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.speak();
        dog.speak();

        cat.setName("Kasper");
        System.out.println(cat.getName());

        dog.setName("Pricken");
        System.out.println(dog.getName());

        //default methods are NOT unique
        cat.checkIfVaccinated();
        dog.checkIfVaccinated();

    }
}
