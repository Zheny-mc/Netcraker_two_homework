package ru.netcraker.horsman.ch2.Task9;

public interface ICarActions {
    void drive(int speed, int time);
    void stop();
    void refuel(int halon);
    int getLevelFuel();
}
