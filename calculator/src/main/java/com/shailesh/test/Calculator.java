package com.shailesh.test;

import com.shailesh.test.exception.InvalidInputException;

import java.util.regex.Pattern;

import static java.lang.Integer.valueOf;

/**
 * Created by Shailesh on 3/8/16.
 */
public class Calculator {
    private final String _VALID_INPUT_REGEX = "(\\d*\\W{1}\\d+)+";

    public Integer add(String numbers) throws InvalidInputException {
        int sum = 0;
        if (!numbers.isEmpty()) {
            if (isValidInput(numbers)) {
                throw new InvalidInputException("Invalid Exception, Please enter data again");
            } else {
                final String sanitizedNumbers[] = numbers.split("\\W");

                for (int index = 0; index < sanitizedNumbers.length; index++) {
                    sum += valueOf(sanitizedNumbers[index]);
                }
            }
        }
        return sum;
    }

    private boolean isValidInput(String numbers) {
        final Pattern pattern = Pattern.compile(_VALID_INPUT_REGEX);
        return numbers.contains("-") || numbers.contains(".") || !pattern.matcher(numbers).matches();
    }
}
