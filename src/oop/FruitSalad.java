package oop;

import java.util.Scanner;
// Skapa frukter till vi skriver "stop"
// Och då skriva ut antal frukter samt
// antal gröna frukter och vilken som är störst
// max antal frukter är 5;
public class FruitSalad {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fruit[] myFruits = new Fruit[5]; // {null,null,null,null,null}
        int myFruitIndex =0;
        System.out.println("Mata in alla frukter avsluta med stop");
        Fruit fruit;
        while(true) {
            System.out.print("Namn på frukten ");
            String name = scan.nextLine();
            if (name.equals("stop")) break;
            System.out.print("Färg på frukten ");
            String color = scan.nextLine();
            System.out.print("Storlek på frukten ");
            int size = Integer.parseInt(scan.nextLine());
            System.out.print("Smak på frukten ");
            String taste = scan.nextLine();

            // skapa vår frukt med inmatad information
            fruit = new Fruit(name,color);
            fruit.setSize(size);
            fruit.setTaste(taste);
            myFruits[myFruitIndex] = fruit;   // {PäronObjekt,null,null,null,null}
            myFruitIndex++;
        }
        System.out.println(myFruits[0].getName());
        System.out.println(myFruits[0].getSize());


        Fruit[] biggestFruits = FruitFilter.biggest(myFruits);
        for (Fruit f:biggestFruits){
            System.out.println("Störst är "+f.getName()+" med storlek "+f.getSize());
        }

        Fruit[] redFruits = FruitFilter.colorFilter(myFruits,"röd");
        System.out.println("De röda frukterna är");
        for (Fruit f:redFruits){
            System.out.println(f.getName());
        }
    }
}

