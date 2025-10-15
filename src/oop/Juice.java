package oop;

public class Juice {
    //Egenskaper Attribut
    String farg,smak, forpackning,tillverkare;
    public double storlekLiter = 1;
    private String hallbarhet = "1 månad";

    // Konstruktor heter samma som klassen Juice  // parametrar till metoden
    public Juice(String fargInput,String smakInput,String forpackningInput,String tillverkareInput){
        farg = fargInput;
        smak= smakInput;
        forpackning= forpackningInput;
        tillverkare = tillverkareInput;

    }

    public void dricker(double volym){
        storlekLiter = storlekLiter - volym; // storlekLiter -= volym
    }

    public String getHallbarhet() {
        return hallbarhet;
    }

// Måste attribut att skicka med när man skapar sin Juice

}


