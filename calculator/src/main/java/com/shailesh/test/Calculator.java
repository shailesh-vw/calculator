package com.shailesh.test;

import java.util.Arrays;

import static java.lang.Integer.valueOf;

/**
 * Created by Shailesh on 3/8/16.
 */
public class Calculator {
    public Integer add(String numbers) {
        int sum = 0;
        String sanitizedNumbers[] = numbers.split("\\W");

        for (String number : Arrays.asList(sanitizedNumbers)) {
            sum += valueOf(number);
        }
        return sum;
    }
}
