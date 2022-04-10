package ru.netcraker.horsman.ch2.Task9;

import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@ToString
public class Car implements ICarActions {
    private MyPoint curPoint;
    private Integer speed;
    private Map<Integer, Integer> consumption; //<speed, gasLevel> за 1 second
    private Integer gasLevel;
    private Integer distanceTraveled;

    public Car(Integer gasLevel) {
        this.curPoint = new MyPoint(0);
        this.speed = 0;
        this.consumption = Map.of(2,2, 3, 5,5, 6);
        this.gasLevel = gasLevel;
        this.distanceTraveled = 0;
    }

    @Override
    public void drive(int speed, int time) {
        this.speed = speed;

        gasLevel -= consumption.get(speed) * time;
        //-----------------------
        stop();
    }

    @Override
    public void stop() {
        speed = 0;
    }

    @Override
    public void refuel(int halon) {
        if (halon > 0){
            this.gasLevel += halon;
        }
    }

    @Override
    public int getLevelFuel() {
        return gasLevel;
    }
}
