package Inheritance;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnderGraduateTest {

    private Student stud;

    @Before
    public void setUp() throws Exception {
        stud = new Student();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void welcome() {
    }

    @Test
    public void getId() {
        Assert.assertEquals(stud.getId(), "123456");
    }

    @Test
    public void getName() {
        Assert.assertEquals(stud.getName(), "Matthew");
    }

    @Test
    public void getStudyYears() {
        Assert.assertEquals(stud.getStudyYears(), 3);
    }

}