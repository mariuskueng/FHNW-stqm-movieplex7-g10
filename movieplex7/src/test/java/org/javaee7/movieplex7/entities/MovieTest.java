package org.javaee7.movieplex7.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mariuskueng on 16.11.15.
 */
public class MovieTest {
    Movie classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new Movie(1234);
    }

    @Test
    public void testId() {
        assertEquals(classUnderTest.getId(), new Integer(1234));
    }

    @Test
    public void testName() {
        classUnderTest.setName("The Room");
        assertEquals("The Room", classUnderTest.getName());
    }

    @Test
    public void testActors() {
        String actors = "Jonny Depp, Sepp Blatter";

        classUnderTest.setActors(actors);

        assertEquals(actors, classUnderTest.getActors());
    }

    @Test
    public void testEquals() {
        Movie classUnderTestClone = new Movie(5612);

        assertFalse(classUnderTest.equals(classUnderTestClone));

        classUnderTestClone = classUnderTest;
        assertTrue(classUnderTest.equals(classUnderTestClone));
    }

    @After
    public void tearDown() throws Exception {
        classUnderTest = null;
    }
}