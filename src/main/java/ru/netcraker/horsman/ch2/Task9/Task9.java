package ru.netcraker.horsman.ch2.Task9;

public class Task9 {
    public static void runModelCar() {
        ICarActions car = new Car(100);

        System.out.println("The car travels at a speed of 2 knots per second for 10 seconds");
        car.drive(2, 10);
        System.out.println( String.format("Level Fuel = %d", car.getLevelFuel()) );
        System.out.println("Car refuel on 30 halon");
        car.refuel(30);
        System.out.println( String.format("New level fuel = %d", car.getLevelFuel()) );
    }
}
