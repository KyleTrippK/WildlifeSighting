package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredAnimalsTest {

//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
    @Test
    public void endangered_instantiatesCorrectly_true(){
        EndangeredAnimals testEndangered = testEndangered();
        assertEquals(true, testEndangered instanceof EndangeredAnimals);
    }

    @Test
    public void endangered_instantiatesWithName_elephant(){
        EndangeredAnimals testEndangered = testEndangered();
        assertEquals("elephant", testEndangered.getEndangeredName());
    }

    @Test
    public void endangered_instantiatesWithId_5(){
        EndangeredAnimals testEndangered = testEndangered();
        assertEquals(5, testEndangered.getEndangeredId());
    }

    @Test
    public void endangered_instantiatesWithHealth_healthy(){
        EndangeredAnimals testEndangered = testEndangered();
        assertEquals("healthy", testEndangered.getHealth());
    }

    @Test
    public void endangered_instantiatesWithAge_young(){
        EndangeredAnimals testEndangered = testEndangered();
        assertEquals("young", testEndangered.getAge());
    }

    // helper methods
    public EndangeredAnimals testEndangered(){
        return new EndangeredAnimals("elephant", 5, "healthy", "young");
    }
}