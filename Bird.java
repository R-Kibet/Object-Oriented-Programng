package org.exp.OOP2;


//inheritance  bird and dog class inheritrites atributes of animal//
public class Bird extends Animals {

    //private used for only the bird class cant apply to dog//
    private int wings;

    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }


    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Eating fin ");
    }

    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

    public void fly (String high){

    }

    public void fly(int speed ){

    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}

