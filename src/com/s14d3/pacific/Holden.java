package com.s14d3.pacific;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return super.getName() + "'s engine is starting.";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return super.getName() + " is accelerating";
    }

    @Override
    public String carBreak() {
        System.out.println(getClass().getSimpleName());
        return super.getName() + " is breaking.";
    }
}
