package ru.netcraker.horsman.ch3.Task1_2;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Employee implements IEmployeeActions{
    private Double salary;

    @Override
    public double getMeasure() {
        return salary;
    }
}
