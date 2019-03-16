package com;

import Inheritance.UnderGraduate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InheritPartTwoTest {

    private UnderGraduate grad;

    @Before
    public void setUp() throws Exception {
        grad = new UnderGraduate();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
        String test = grad.toString();
        Assert.assertNotNull(test);
    }
}