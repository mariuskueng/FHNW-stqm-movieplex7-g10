package org.javaee7.movieplex7.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mariuskueng on 16.11.15.
 */
public class SalesTest {
    Sales classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Sales(1);
    }

    @After
    public void tearDown() throws Exception {
        classUnderTest = null;
    }

    @Test
    public void testGetId() throws Exception {
        assertEquals(classUnderTest.getId(), new Integer(1));
    }

    @Test
    public void testGetAmount() throws Exception {
        double amount = 1000;
        classUnderTest.setAmount(amount);

        assertEquals(classUnderTest.getAmount(), amount, 0.001);
    }

    @Test
    public void testEquals() throws Exception {
        Sales classUnderTestClone = new Sales(2);

        assertFalse(classUnderTest.equals(classUnderTestClone));

        classUnderTestClone = classUnderTest;
        assertTrue(classUnderTest.equals(classUnderTestClone));
    }
}