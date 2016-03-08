package com.shailesh.test;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shailesh on 3/8/16.
 */
public class CalculatorTest {

    @Test
    public void additionalFunctionalityOfCalculator() {
        Calculator calculator = new Calculator();
        Integer actualSum = calculator.add("1,2");
        assertThat(actualSum, is(3));
    }
}
