package ru.netcraker.horsman.ch2.Task5;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

public class Task5 {

    @Builder
    @Getter
    @EqualsAndHashCode
    @ToString
    public static class MyPoint {
        private double x;
        private double y;
        private double scale;

        public MyPoint translate(double x, double y) {
            return new MyPoint(x, y, this.scale);
        }

        public MyPoint scaleUp(double scale) {
            this.scale = scale;
            return new MyPoint(x * this.scale, y * this.scale, this.scale);
        }
    }

    public static void test() {
        MyPoint point = new MyPoint.MyPointBuilder()
                .x(3.).y(4.).scale(1)
                .build();

        System.out.println("before: " + point);
        point = point.translate(2, 3).scaleUp(0.5);
        System.out.println("after: " + point);
    }
}
