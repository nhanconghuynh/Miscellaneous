package com.company;
/*
 * All Dogs are Animals but all Animals are not Dog
 */
public class Dog extends Animal {

    public Dog() {
        super();
        System.out.println("I am Loyalty!");
    }

    @Override
    public String sleep() {
        return "A dog sleeps...";
    }

    @Override
    public String eat() {
        return "A dog eats...";
    }

    public String bark() {
        return "Bark bark...";
    }

}