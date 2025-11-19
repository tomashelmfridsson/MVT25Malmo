package oop;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
        assertTrue(apple.isVegetarian());
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
        Fruit[] allFruits = {pear,grape,watermelon,apple};
        Fruit[] greenFruits = FruitFilter.colorFilter(allFruits ,"green");
        System.out.println(greenFruits[0].getName());
        System.out.println(greenFruits[1].getName());
        System.out.println(greenFruits[2].getName());
        assertEquals(3,greenFruits.length);
    }

    @Test
    public void testBiggestFruit(){
        Fruit grape = new Fruit("grape","red");
        grape.setSize(1);
        Fruit pear = new Fruit("pear","green");
        pear.setSize(5);
        Fruit watermelon = new Fruit("watermelon","green");
        watermelon.setSize(20);
        Fruit apple = new Fruit("apple","green");
        apple.setSize(7);
        Fruit[] biggestFruitsArray = FruitFilter.biggest(new Fruit[] {pear,grape,watermelon,apple});
        assertEquals( 1, biggestFruitsArray.length);
        assertEquals("watermelon",biggestFruitsArray[0].getName());
    }

    @Test
    public void testBiggestFruit2Fruits(){
        Fruit grape = new Fruit("grape","red");
        grape.setSize(1);
        Fruit pear = new Fruit("pear","green");
        pear.setSize(5);
        Fruit apple = new Fruit("apple","green");
        apple.setSize(5);
        Fruit[] biggestFruitsArray = FruitFilter.biggest(new Fruit[] {pear,grape,apple});
        assertEquals( 2, biggestFruitsArray.length);
        assertEquals("pear",biggestFruitsArray[0].getName());
        assertEquals("apple",biggestFruitsArray[1].getName());
    }

}
