package org.fasttrackit;

public class Game {

    private Car firstCompetitor;
    private Car secondCompetitor;

    public void start() {
        Car car1 = new Car("Dacia");
        car1.setColor("red");
        car1.setDoorCount(3);
        car1.setMileage(7.5);
        car1.setFuelLevel(50);

        Engine engine1 = new Engine();
        engine1.setManufacturer("Renault");

        car1.setEngine(engine1);

        Car car2 = new Car("Ford");
        car2.setColor("black");
        car2.setDoorCount(2);
        car2.setMileage(8.2);
        car2.setFuelLevel(47);

        Engine engine2 = new Engine();
        engine2.setManufacturer("Ford");

        car2.setEngine(engine2);

        firstCompetitor = car1;
        secondCompetitor = car2;

        car1.accelerate(7.2, 6.9);

        System.out.println(car1);
    }

    public Car getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Car firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Car getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Car secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
