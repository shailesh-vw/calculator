package com.shailesh.test;

import com.shailesh.test.exception.InvalidInputException;

import java.util.regex.Pattern;

import static java.lang.Integer.valueOf;

/**
 * Created by Shailesh on 3/8/16.
 */
public class Calculator {
    public Integer add(String numbers) throws InvalidInputException {
        int sum = 0;
        if (!numbers.isEmpty()) {

            final Pattern pattern = Pattern.compile("(\\d*\\W{1}\\d+)+");
            if (numbers.contains("-") || numbers.contains(".") || !pattern.matcher(numbers).matches()) {
                throw new InvalidInputException("Invalid Exception, Please enter data again");
            } else {
                String sanitizedNumbers[] = numbers.split("\\W");

                for (int index = 0; index < sanitizedNumbers.length; index++) {
                    sum += valueOf(sanitizedNumbers[index]);
                }

            }
        }
        return sum;
    }
}
