package oop.rectangle;

public class Rectangle {
    private int hojd, bredd; // Atrribut i min klass

    // Konstruktor med inparametrar
    public Rectangle(int hojd, int bredd) {
        this.bredd = bredd;
        this.hojd = hojd;
    }

    public int area() {
        return hojd * bredd;
    }

    public int omkrets(){
        return hojd+hojd+bredd+bredd;
    }

    public boolean isKvadrat(){
        return bredd == hojd;
    }

}
