package oop.lamp;

public class Lamp {
    private String status = "off";

    public String getStatus() {
        return status;
    }


    public void turnOn() {
        this.status = "on";
    }


    public void turnOff() {
        this.status = "off";
    }
}
