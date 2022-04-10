package ru.netcraker.horsman.ch2.Task9;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class MyPoint {
    private Integer x;
    public MyPoint move(int x) {
        return new MyPoint(x);
    }
}