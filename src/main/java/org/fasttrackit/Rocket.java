package org.fasttrackit;

public class Rocket extends AutoVehicle {

    public Rocket(String name) {
        super(name);
    }

    @Override
    public double accelerate(double speed, double time) {
        System.out.println("Vehicle " + getName() + " accelerates with " + speed + " for " + time + " seconds.");
        double traveledDistance = speed * time;
        // rockets are for cheaters
        traveledDistance *= 2;
        // same as traveledDistance = traveledDistance * 2
        System.out.println("Traveled distance: " + traveledDistance);
        return traveledDistance;
    }
}
