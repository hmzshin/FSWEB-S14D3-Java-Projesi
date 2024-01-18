package com.s14d3.RandD;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLitre;

    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(super.getName() + " Gas powered engine started");

    }

    @Override
    public void drive() {
        this.runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(super.getName() + " Gas powered engine is running");
    }
}
