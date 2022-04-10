package ru.netcraker;

import com.opencsv.exceptions.CsvException;
import ru.netcraker.horsman.ch1.*;
import ru.netcraker.horsman.ch2.Task13.ReadCSV;
import ru.netcraker.horsman.ch2.Task5.Task5;
import ru.netcraker.horsman.ch2.Task9.Task9;
import ru.netcraker.horsman.ch3.Task1_2.Employee;
import ru.netcraker.horsman.ch3.Task1_2.IEmployeeActions;
import ru.netcraker.horsman.ch3.Task4.IntSequence;
import ru.netcraker.horsman.ch3.Task5.TestGenerate;

import java.io.IOException;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        App app = new App();
//        app.test1();
//        app.test2();
//        app.test3();
//        app.test4();
//        app.test5();
//        app.test6();
//        app.test7();
//        app.test8();
//        app.test9();
//        app.test10();
        app.test11();
    }
    //ch1
    private void test1() {
        System.out.println( String.format("angle = %f", Task2.normalize360(720.)) );
        System.out.println( String.format("angle(FloorMod) = %f", Task2.normalizeFloorMod360(720.)) );
    }
    private void test2() {
        System.out.println(
                String.format("fact(BigInt) = %d", Task6.factorial(5)));
    }
    private void test3() {
        System.out.print("[ ");
        Task8.splitString("Evgeny is writing a program")
                .forEach((i) -> System.out.print(i + ", "));
        System.out.println("]");
    }
    private void test4() {
        var list = Task13.createList(10);
        System.out.print("[ ");
        Task13.removeRandElem(list, 6).forEach((i) -> System.out.print(i + ", "));
        System.out.println("]");
    }
    private void test5() {
        List<List<Integer>> box = Task14.createMagicSquare();
        box.forEach((i) -> {
            i.forEach((j) -> System.out.print(j + " "));
            System.out.println();
        });
        boolean response = Task14.isMagicSquare(box);
        System.out.println("Is this square magical? " + response);
    }

    //ch2
    private void test6() {
        Task5.test();
    }
    private void test7() {
        Task9.runModelCar();
    }
    private void test8() {
        try {
            ReadCSV.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            e.printStackTrace();
        }
    }

    //ch3
    // task1_2
    private void test9() {
        Launch launch = () -> {
            List<IEmployeeActions> employees = List.of(
                    new Employee(100.),
                    new Employee( 200.),
                    new Employee( 300.),
                    new Employee( 400.)
            );

            System.out.println("Salary employee");
            employees.forEach((i) -> System.out.println(i + ", "));
            System.out.println("====================================");

            OptionalDouble average = employees.stream()
                    .mapToDouble(IEmployeeActions::getMeasure).average();
            if (average.isPresent()) {
                System.out.println(String.format("Average salary = %.3f", average.getAsDouble()) );
            }

            OptionalDouble max = employees.stream()
                    .mapToDouble(IEmployeeActions::getMeasure).max();
            if (max.isPresent()) {
                System.out.println(String.format("Max salary = %.3f", max.getAsDouble()) );
            }
        };
        launch.run();
    }
    //task4
    private void test10() {
        Launch launch = () -> {
            System.out.println("IntSequence = " +
                    IntSequence.of(1, 2, 3, 4, 5, 6));
        };
        launch.run();
    }
    //task5
    private void test11() {
        Stream.generate(new TestGenerate()::next)
                .limit(10).forEach((i) -> System.out.print(i + ", "));
    }
}
