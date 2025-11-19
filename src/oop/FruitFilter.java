package oop;

public class FruitFilter {
    public static Fruit[] colorFilter(Fruit[] fruitsArray, String color) {
        // Ta reda på antalet frukter med önskad färg
        int numberOfColorFruits = 0;

        for (Fruit f : fruitsArray) {   // {PäronObjekt,null,null,null,null}
            if (f != null)
                if (f.color.equals(color)) numberOfColorFruits++;
        }
        // [pear,watermelon,grape,apple]

        // skapa en array med storlek av antalet frukter i önskad färg
        Fruit[] coloredFruits = new Fruit[numberOfColorFruits];

        // stoppa in dom frukterna med önskad färg i den nya arrayen
        int coloredFruitIndex = 0;
        for (Fruit f : fruitsArray) {
            if (f != null){
                if (f.color.equals(color)) {
                    coloredFruits[coloredFruitIndex] = f;
                    coloredFruitIndex++;
                }
            }
        }
        return coloredFruits;
    }

    public static Fruit[] biggest(Fruit[] fruitsArray) {
        // Ta reda på storleken på största frukten
        int maxSize = 0;
        for (Fruit fruit : fruitsArray) {
            if (fruit != null)
                if (fruit.getSize() > maxSize) maxSize = fruit.getSize();
        }

        // Ta reda på antalet frukter med störst storlek
        int numberOfMaxSizeFruits = 0;
        for (Fruit fruit : fruitsArray) {
            if (fruit != null)
                if (fruit.getSize() == maxSize) numberOfMaxSizeFruits++;
        }

        // skapa en array med storlek numberOfMaxSizeFruits
        Fruit[] maxSizeFruitsArray = new Fruit[numberOfMaxSizeFruits];

        // Stoppa in den/de största frukterna i arrayen som skall returneras
        int maxSizeFruitIndex = 0;
        for (Fruit fruit : fruitsArray) {
            if (fruit != null) {
                if (fruit.getSize() == maxSize) {
                    maxSizeFruitsArray[maxSizeFruitIndex] = fruit;
                    maxSizeFruitIndex++;
                }
            }
        }
        return maxSizeFruitsArray;
    }
}
