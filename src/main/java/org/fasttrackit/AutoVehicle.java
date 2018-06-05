package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    private Engine engine;

    public AutoVehicle(String name) {
        this(name, new Engine());
    }

    public AutoVehicle(String name, Engine engine) {
        super(name);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
