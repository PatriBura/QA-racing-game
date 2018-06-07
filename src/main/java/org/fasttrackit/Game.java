package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    public static final int INITIAL_FUEL_LEVEL = 300;
    public static final int LOWER_MILEAGE_BOUND = 3;
    public static final int UPPER_MILEAGE_BOUND = 20;
    private Vehicle[] competitors = new Vehicle[10];
    private List<Vehicle> competitorsList = new ArrayList<>();

    private Car firstCompetitor;
    private Car secondCompetitor;

    public void start() {
        initCompetitors();

//        Car car1 = new Car("Dacia");
//        car1.setColor("red");
//        car1.setDoorCount(3);
//        car1.setMileage(7.5);
//        car1.setFuelLevel(50);
//
//        Engine engine1 = new Engine();
//        engine1.setManufacturer("Renault");
//
//        car1.setEngine(engine1);
//
//        Car car2 = new Car("Ford");
//        car2.setColor("black");
//        car2.setDoorCount(2);
//        car2.setMileage(8.2);
//        car2.setFuelLevel(47);
//
//        Engine engine2 = new Engine();
//        engine2.setManufacturer("Ford");
//
//        car2.setEngine(engine2);
//
//        competitors[0] = car1;
//        competitors[1] = car2;
//
//        competitorsList.add(car1);
//        competitorsList.add(car2);
//
//        for (int i = 0; i < competitors.length; i++) {
//            System.out.println("Iteration number" + i);
//            System.out.println(competitors[1]);
//        }
//
//        for (Vehicle vehicle : competitors) {
//            System.out.println(vehicle);
//        }
//
//        for (int i = 0; i < competitorsList.size(); i++) {
//            System.out.println(competitorsList.get(i));
//        }
//
//        for (Vehicle fdsajfas : competitorsList) {
//            System.out.println(fdsajfas);
//        }

//        firstCompetitor = car1;
//        secondCompetitor = car2;
//
//        car1.accelerate(7.2, 6.9);
//
//        System.out.println(car1);
    }

    private void initCompetitors() {
        System.out.println("Enter number of players");
        int playerNumber = readAndCheckInt();


        System.out.println("Starting game with " + playerNumber + " players");
        for (int i = 1; i <= playerNumber; i++) {
            String name = readCarStringProperty("Enter car name for player " + i);
            String color =  readCarStringProperty("Enter car color for player " + i);

            Vehicle vehicle = new Car(name);
            vehicle.setColor(color);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(LOWER_MILEAGE_BOUND, UPPER_MILEAGE_BOUND));
            vehicle.setFuelLevel(INITIAL_FUEL_LEVEL);
            System.out.println("Vehicle for player " + i + ": " + vehicle);
            competitorsList.add(vehicle);
        }
    }

    private int readAndCheckInt() {
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
       number = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Please enter a valid number");
            number = readAndCheckInt();
        }
        return number;
    }

    private String readCarStringProperty(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
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
