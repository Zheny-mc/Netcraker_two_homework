package ru.netcraker.horsman.ch1;

import java.math.BigInteger;

public class Task6 {
    public static BigInteger factorial(int n) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(Integer.toString(i)));
        }
        return bigInteger;
    }
}
