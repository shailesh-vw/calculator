package com.shailesh.test.exception;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by Shailesh on 3/8/16.
 */
public class InvalidInputExceptionTest {

    @Test
    public void exceptionWithParameterizedConstructorToOverrideExceptionMessage() throws Exception{
        Exception fakeException = new InvalidInputException("This is fake input...!");
        assertThat(fakeException.getMessage(),is("This is fake input...!"));
    }

}