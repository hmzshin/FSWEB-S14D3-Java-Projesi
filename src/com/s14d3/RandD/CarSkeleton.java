package com.s14d3.RandD;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Engine is started.");

    }

    public void drive() {
        this.runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine is running.");
    }
}
