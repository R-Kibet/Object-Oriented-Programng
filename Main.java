package org.exp.OOP2;

public class Main {
    public static void main(String[] args) {
        Bird phoenix = new Bird("Mti", "Dark", 2, true , 2);
        System.out.println(phoenix.getName());

        phoenix.eat("grass");

        System.out.println(phoenix.getWings());
        phoenix.fly("low");
    }
}
