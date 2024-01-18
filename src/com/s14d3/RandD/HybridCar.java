package com.s14d3.RandD;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre;

    private int batterySize;

    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(super.getName() + " Hybrid engine started");

    }

    @Override
    public void drive() {
        this.runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(super.getName() + " Hybrid engine is running");
    }
}
