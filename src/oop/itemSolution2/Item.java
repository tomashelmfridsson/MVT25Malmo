package oop.itemSolution2;

public class Item {
    private String name;
    private double originalPrice;
    private double currentPrice;

    public Item(String name, double price){
        this.name = name;
        this.originalPrice = price;
        this.currentPrice = price;
    }
    public boolean applyDiscount(double procent){
        if(procent<0 || procent >100){
            return false;

        }
        else{ currentPrice = originalPrice - (originalPrice * procent/100);
            return true; }
    }
    public void printInfo(){
        System.out.println("Namn: " + name);
        System.out.println("Pris före rabatt: " + originalPrice + " kr");
        System.out.println("Pris efter rabatt: " + currentPrice + " kr");
    }
}
