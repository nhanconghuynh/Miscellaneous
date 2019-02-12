package com.company;

/*
 * All Mice are Animals but all Animals are not Mice
 */
public class Mouse extends Animal {

    public Mouse() {
        super();
        System.out.println("I am a mouse. Can you catch me?");
    }

    @Override
    public String sleep() {
        return "A mouse sleeps...";
    }

    @Override
    public String eat() {
        return "A mouse eats...";
    }

    public String hide() {
        return "Runs and hides...";
    }

}