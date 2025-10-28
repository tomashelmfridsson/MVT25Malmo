package oop.itemSolution2;

public class ItemMain {
    public static void main(String[] args) {

        Item myItem = new Item("Hörlurar", 1000);

        if (myItem.applyDiscount(20)) {
            myItem.printInfo();
        } else System.out.println("Ogiltig procentsats");
    }
}
