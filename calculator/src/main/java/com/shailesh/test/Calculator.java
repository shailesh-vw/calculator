package com.shailesh.test;

import static java.lang.Integer.valueOf;

/**
 * Created by Shailesh on 3/8/16.
 */
public class Calculator {
    public Integer add(String numbers) {
        //^($|\\d)*\\W{1}\\d+
        int sum = 0;
        if (numbers.isEmpty()) {
            return sum;
        } else {
            String sanitizedNumbers[] = numbers.split("\\W");

            for (int index = 0; index < sanitizedNumbers.length; index++) {
                sum += valueOf(sanitizedNumbers[index]);
            }

        }
        return sum;
    }
}
