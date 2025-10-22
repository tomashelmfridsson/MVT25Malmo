package oop.item;

// Skapa en klass Item:
//Konstruktorn ska ta in ett namn och ett pris.
//Skapa en metod applyDiscount som tar in en procent och sänker
// priset med den procentsatsen.
//Skapa ett Item-objekt i main, applicera en rabatt och visa det nya priset.
public class itemMain {
    public static void main(String[] args) {
        Item myItem = new Item("Paraply", 100);
        System.out.println("Varan " + myItem.getName() + " kostar " + myItem.getPrice());
        myItem.applyDiscount(25);
        System.out.println("Varan " + myItem.getName() + " kostar efter prissänkning " + myItem.getPrice());
    }
}
