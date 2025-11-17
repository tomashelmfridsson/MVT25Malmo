package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FriutTest {

    @Test
    public void testOfColor() {
        Fruit pear = new Fruit("pear","green");
        assertEquals("green", pear.getColor());
    }

    @Test
    public void testIsVegetarian(){
        Fruit apple = new Fruit("apple","green");
        assertTrue(apple.isVegetable());
    }

    @Test
    public void testOfTaste(){
        Fruit watermelon = new Fruit("watermelon","green");
        watermelon.setTaste("sweet");
        assertEquals("sweet",watermelon.getTaste());
    }

    @Test
    public void testOfSize(){
        Fruit grape = new Fruit("grape","red");
        grape.setSize(1);
        assertEquals(1,grape.getSize());
    }

    @Test
    public void testIncludeSeeds(){

    }

    @Test
    public void testEditableForHumans(){

    }

    @Test
    public void testOfExtraFacts(){

    }
    @Test
    public void testAllGreenFruits(){
        Fruit pear = new Fruit("pear","green");
        Fruit grape = new Fruit("grape","red");
        Fruit watermelon = new Fruit("watermelon","green");
        Fruit apple = new Fruit("apple","green");
        Fruit[] greenFruits = FruitFilter.allGreen(new Fruit[] {pear,grape,watermelon,apple});
        assertEquals(3,greenFruits.length);
    }

}
