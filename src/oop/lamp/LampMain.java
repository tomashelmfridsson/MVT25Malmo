package oop.lamp;
// Skapa en klass Lamp:
//Konstruktorn ska ta in ett boolean-attribut isOn.
//Skapa metoder turnOn och turnOff för att slå på och av lampan.
//Skapa ett Lamp-objekt i main och växla mellan på och av.
public class LampMain {
    public static void main(String[] args) {
        Lamp myLamp = new Lamp();
        System.out.println("Min lampa är: "+myLamp.getStatus());
        myLamp.turnOn();
        System.out.println("Min lampa är: "+myLamp.getStatus());
        myLamp.turnOff();
        System.out.println("Min lampa är: "+myLamp.getStatus());


    }
}
