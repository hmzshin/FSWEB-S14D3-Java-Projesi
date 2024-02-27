package com.s14d3.pacific;

import java.lang.String;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
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
