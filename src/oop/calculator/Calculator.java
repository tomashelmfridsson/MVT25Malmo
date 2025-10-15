package oop.calculator;

// Skapa en class Calculator som läser in två tal i
// konstruktorn och sparar dem som attribut
// Uppdatera Calculator så att den har liknande
// metoder för minus/delat med/gånger

public class Calculator {
    int tal1, tal2;       // Attribut, instans variabler

    // Konstruktor
    public Calculator(int tal1, int tal2) {
        // x&B paramtrar finns bara i kodblocket
        this.tal1 = tal1;
        this.tal2 = tal2;
    }

    //Skapa en metod som returnerar addition för dessa två tal.
    public int addition() {
        int summa = tal1 + tal2;
        return summa; // return tal1+tal2;
    }

    public int subtraktion() {
        return tal1 - tal2;
    }

    public double division() {
        return (double) tal1 / tal2;
    }

    public int multiplikation() {
        return tal1 * tal2;
    }

}
