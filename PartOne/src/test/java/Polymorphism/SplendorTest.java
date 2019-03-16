package Polymorphism;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SplendorTest {

    private Bike bike;

    @Before
    public void setUp() throws Exception {
        bike = new Splendor();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void run() {

        bike.run();
        Assert.assertNotNull(bike.toString());
    }
    }
