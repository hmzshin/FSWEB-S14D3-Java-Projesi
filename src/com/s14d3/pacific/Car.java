package com.s14d3.pacific;

import java.util.Objects;


public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }


    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "The car's engine is starting.";
    }

    public  String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "The car is accelerating";
    }

    public String carBreak(){
        System.out.println(getClass().getSimpleName());
        return "The car is breaking.";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }


    @Override
    public String toString() {
        return "com.s14d3.pacific.Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
