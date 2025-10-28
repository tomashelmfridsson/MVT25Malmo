package oop.lampSolution2;

public class myLamp {
    public static void main(String[] args) {
        Lamp myLamp = new Lamp(false);
        System.out.println("lampans status är: " + myLamp.isOn());
        if(myLamp.turnOn()) System.out.println("Lampan är på!");
        else System.out.println("det gick ej att tända lampan.");
        System.out.println("lampans status är: " + myLamp.isOn());

        if(myLamp.turnOff()) System.out.println("Lampan är släckt!");
        else System.out.println("det gick ej att släcka lampan.");
        System.out.println("lampans status är: " + myLamp.isOn());
    }
}