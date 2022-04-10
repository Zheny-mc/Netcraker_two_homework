package ru.netcraker.horsman.ch1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Task13 {

    public static List<Integer> createList(int size) {
        List<Integer> list = new ArrayList<>();
        IntStream.range(1, size+1).forEach((i) -> list.add(i));
        return list;
    }

    public static List<Integer> removeRandElem(List<Integer> listElem, int countRemoveElem) {
        Random rand = new Random();
        for (int i = countRemoveElem; i > 0; i--) {
            listElem.remove(rand.nextInt(listElem.size()));
        }
        return listElem;
    }
}
