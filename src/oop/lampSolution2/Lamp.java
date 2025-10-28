package oop.lampSolution2;

public class Lamp {
    private boolean isOn;

    public Lamp(boolean isOn) {
        this.isOn = isOn;
    }
    public boolean turnOn() {
        isOn = true;
        return true;  //behövs inte för ett så här enkelt fall, men kan vara bra om det är ett komplext fall.
    }

    public boolean turnOff() {
        isOn = false;
        return true;  //behövs inte för ett så här enkelt fall, men kan vara bra om det är ett komplext fall.
    }

    public boolean isOn() {
        return isOn;
    }


}