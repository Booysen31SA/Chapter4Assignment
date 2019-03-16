package Encapulation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderClassTest {

    private BuilderClass carBuild;

    @Before
    public void setUp() throws Exception {
        carBuild = BuilderClass.CarBuilder.newInstance()
                    .setCarName("Toyota")
                    .setCarColour("Blue")
                    .setWheelSize(14).build();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getCarName() {
        Assert.assertEquals(carBuild.getCarName(), "Toyota");
    }

    @Test
    public void getCarColour() {
        Assert.assertEquals(carBuild.getCarColour(), "Blue");
    }

    @Test
    public void getWheelSize() {
        Assert.assertEquals(carBuild.getWheelSize(), 14);
    }
}