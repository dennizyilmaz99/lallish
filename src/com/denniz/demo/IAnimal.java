package com.denniz.demo;

public interface IAnimal {
    void speak();
    String getName();
    void setName(String name);

    default void checkIfVaccinated() {
        System.out.println("Checking if vaccinated");
    }
}
