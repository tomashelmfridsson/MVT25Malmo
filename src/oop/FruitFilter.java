package oop;

public class FruitFilter {
    public static Fruit[] allGreen(Fruit[] fruitsArray){
        // Ta reda på antalet gröna fruker
        int numberOfGreenFruits =0;
        int numberOfFruits = fruitsArray.length;
        for (int i=0;i<numberOfFruits;i++){
            if (fruitsArray[i].color.equals("green")) numberOfGreenFruits++;
        }
        // skapa en array med storlek numberOFGreenFruits
        Fruit[] greenFruits = new Fruit[numberOfGreenFruits];
        // stoppa in dom gröna frukterna i arrayen
        int greenFruitIndex = 0;
        for (int i=0;i<numberOfFruits;i++){
            if (fruitsArray[i].color.equals("green")) {
                greenFruits[greenFruitIndex] = fruitsArray[i];
                greenFruitIndex++;
            }
        }
        return greenFruits;
    }
}
