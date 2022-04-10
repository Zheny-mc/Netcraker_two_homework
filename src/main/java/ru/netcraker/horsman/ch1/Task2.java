package ru.netcraker.horsman.ch1;

public class Task2 {
    public static double normalize360(double angle) {
        return (angle % 360) < 0? angle + 360 : angle;
    }

    public static double normalizeFloorMod360(double angle) {
        return Math.floorMod((int) angle, 360) < 0? angle + 360 : angle;
    }
}
