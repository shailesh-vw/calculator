package com.shailesh.test;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Shailesh on 3/8/16.
 */
public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void additionFunctionalityOfCalculator() throws Exception {
        Integer actualSum = calculator.add("1,2");
        assertThat(actualSum, is(3));
    }


    @Test
    public void additionFunctionalityOfCalculatorWithPipeSeparatedInput() throws Exception {
        Integer actualSum = calculator.add("2|2");
        assertThat(actualSum, is(4));
    }

    @Test
    public void acceptingNoInputForAdditionFunctionalityOfCalculator() throws Exception {
        Integer actualSum = calculator.add("");
        assertThat(actualSum, is(0));
    }
}
