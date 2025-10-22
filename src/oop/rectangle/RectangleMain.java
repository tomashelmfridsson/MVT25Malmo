package oop.rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangleSmall = new Rectangle(1, 2);
        System.out.println("Arean är: "+rectangleSmall.area());
        System.out.println("Omkretsen är: "+rectangleSmall.omkrets());
        System.out.println("Den är kvadratisk: "+rectangleSmall.isKvadrat());

        Rectangle rectangleSquare = new Rectangle(5, 5);
        System.out.println("Arean är: "+rectangleSquare.area());
        System.out.println("Omkretsen är: "+rectangleSquare.omkrets());
        System.out.println("Den är kvadratisk: "+rectangleSquare.isKvadrat());
    }
}
