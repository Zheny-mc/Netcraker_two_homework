package ru.netcraker.horsman.ch3.Task4;

import java.util.Arrays;

public class IntSequence {
    public static String of(int... values) {
        StringBuilder st = new StringBuilder();
        Arrays.stream(values).forEach(i -> st.append(i + ","));
        return st.toString();
    }
}
