package org.fasttrackit;

public class Car extends AutoVehicle {

    private int doorCount;

    public Car(String name) {
        super(name);
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
