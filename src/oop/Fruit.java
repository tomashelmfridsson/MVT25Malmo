package oop;

public class Fruit {
    // attribut
    String color;
    private String taste;
    private String name;
    private int size;
    private static boolean isVegetarian = true;

    // Konstruktor
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isVegetable() {
        return isVegetarian;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
