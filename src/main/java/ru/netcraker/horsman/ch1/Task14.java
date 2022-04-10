package ru.netcraker.horsman.ch1;

import java.util.*;

public class Task14 {

    public static List<List<Integer>> createMagicSquare() {
        return List.of(
            List.of(1, 1, 1),
            List.of(1, 1, 1),
            List.of(1, 1, 1)
        );
    }

    public static boolean isMagicSquare(List<List<Integer>> box) {
        return comparing_strings(box) || comparison_of_columns(box) ||
                diagonal_matrices(box);
    }

    //-------------------------------------------------------
    //метод суммирования элементов переданного массива
    private static int sum(List<Integer> numbers){
        if(numbers == null) {
            return 0;
        }
        return numbers.stream()
                .reduce(0, (a, b) -> a + b);
    }

    //метод сравнивающий суммы элементов каждой строки матрицы
    private static boolean comparing_strings(List<List<Integer>> box) {
        Set<Integer> set = new HashSet<>();
        for(var lst : box) {
            int value = sum(lst);
            set.add(value);
        }

        return set.size() == 1;
    }

    //метод сравнивающий суммы элементов каждого столбца матрицы
    private static boolean comparison_of_columns(List<List<Integer>> box) {
        Set<Integer> set = new HashSet<>();

        final int SIZE = box.get(0).size();
        for(int i = 0; i < SIZE; i++) {
            List<Integer> temp = new LinkedList<>();
            for (List<Integer> integers : box) {
                temp.add(integers.get(i));
            }
            int value = sum(temp);
            set.add(value);
        }
        return set.size() == 1;
    }

    //метод сравнивающий суммы элементов главной и побочной диагоналей матрицы
    private static boolean diagonal_matrices(List<List<Integer>> box) {
        Set<Integer> set = new HashSet<>();
        //main diagonal
        List<Integer> temp = new LinkedList<>();
        for(int i = 0; i < box.size(); ++i){
            temp.add(box.get(i).get(i));
        }
        set.add(sum(temp));

        //side diagonal
        temp = new LinkedList<>();
        for(int i = 0, j = box.size()-1; i < box.size(); ++i, --j) {
            temp.add(box.get(i).get(j));
        }
        set.add(sum(temp));

        return set.size() == 1;
    }
}
