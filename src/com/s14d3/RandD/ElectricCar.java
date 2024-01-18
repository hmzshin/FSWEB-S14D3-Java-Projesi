package com.s14d3.RandD;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;

    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(super.getName() + " Electric powered engine started");

    }

    @Override
    public void drive() {
        this.runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(super.getName() + " Electric powered engine is running");
    }
}
