package smaUppgifterIJava;

// 1. Skapa ett program som skriver ut kvadraten
// på ett tal som är definierat i en variabel.
// Kvadraten är talet multiplicerat med sig själv.


public class Kvadrat {
    public static void main(String[] args) {
        int mittHeltal;
        mittHeltal = 12;
        int mittAndraHeltal = 13;
        double mittDecimaltal = 9.82;
        char minBokstav = 'g';
        String minString = "Vikten är";
        boolean minBoolean = true; // false
        int kvadratenAvMittHeltal = mittHeltal * mittHeltal;
        double kvadratenAvMittDecimaltal = mittDecimaltal * mittDecimaltal;

        System.out.println(kvadratenAvMittHeltal);
        System.out.println(kvadratenAvMittDecimaltal);

        System.out.println(minString + " " + mittHeltal + minBokstav);
    }

}
