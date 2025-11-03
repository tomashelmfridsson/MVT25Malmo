package arrays;

import java.util.ArrayList;

// 1.I en array finns ett personnummer. Skapa ett program som kontrollerar att
//födelsedatum och de fyra sista siffrorna åtskiljs av ett bindestreck. Skriv ut ett
//felmeddelande om så ej är fallet
public class PersonNummer {
    public static void main(String[] args) {
        // 19990101-1234
        char[] pnr = {'1', '9', '9', '9', '0', '1', '0', '1', '-', '1', '2', '3', '4'};

        System.out.println(pnr);
        System.out.println(pnr.length);

        if (pnr[8] != '-') System.out.println("Bindestreck saknas");
        if (pnr[pnr.length-2] % 2 == 0) {       // modulus %
            System.out.println("Kvinna");
        } else System.out.println("Man");


    }
}
