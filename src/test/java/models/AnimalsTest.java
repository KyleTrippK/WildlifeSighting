package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {

//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void animals_instantiatesCorrectly_true(){
        Animals testAnimals = testAnimals();
        assertEquals(true, testAnimals instanceof Animals);
    }

    @Test
    public void animals_instantiatesWithName_lion(){
        Animals testAnimals = testAnimals();
        assertEquals("Lion", testAnimals.getName());
    }

    @Test
    public void animals_instantiatesWithId_3(){
        Animals testAnimals = testAnimals();
        assertEquals(3, testAnimals.getId());
    }
    //helper methods
    public Animals testAnimals(){
        return new Animals("Lion", 3);
    }
}