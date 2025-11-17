package oop;

public class FruitFilter {
    public static Fruit[] allColored(Fruit[] fruitsArray,String color){
        // Ta reda på antalet frukter med önskad färg
        int numberOfColorFruits =0;
        for (Fruit fruit : fruitsArray) {
            if (fruit.color.equals(color)) numberOfColorFruits++;
        }
        // skapa en array med storlek av anatalet frukter i önskad färg
        Fruit[] greenFruitsArray = new Fruit[numberOfColorFruits];

        // stoppa in dom frukterna med önskad färg i den nya arrayen
        int greenFruitIndex = 0;
        for (Fruit fruit : fruitsArray) {
            if (fruit.color.equals(color)) {
                greenFruitsArray[greenFruitIndex] = fruit;
                greenFruitIndex++;
            }
        }
        return greenFruitsArray;
    }

    public static Fruit[] biggest(Fruit[] fruitsArray) {
        // Ta reda på storleken på största frukten
        int maxSize=0;
        for (Fruit fruit : fruitsArray) {
            if (fruit.getSize() > maxSize) maxSize = fruit.getSize();
        }

        // Ta reda på antalet frukter med störst storlek
        int numberOfMaxSizeFruits =0;
        for (Fruit fruit : fruitsArray) {
            if (fruit.getSize() == maxSize) numberOfMaxSizeFruits++;
        }

        // skapa en array med storlek numberOfMaxSizeFruits
        Fruit[] maxSizeFruitsArray = new Fruit[numberOfMaxSizeFruits];
        int maxSizeFruitIndex = 0;
        for (Fruit fruit : fruitsArray) {
            if (fruit.getSize() == maxSize) {
                maxSizeFruitsArray[maxSizeFruitIndex] = fruit;
                maxSizeFruitIndex++;
            }
        }
        return maxSizeFruitsArray;
    }
}
