package oop.correctwordcount;

// Skapa ett rättstavningsprogram där man tävlar i att skriva ut rätt ord.
// Användaren får ett ord skrivet på skärmen och skall sedan repetera detta
// ordet på kommandoraden. Skriver användaren rätt får den 1 poäng annars
// inget poäng. Repetera detta för några ord (3 ord räcker som exempel) och
// skriv sen ut totalt antal poäng. När du skapar ditt program försök att
// lägga logiken samt sparande av data i en class och låt classen med
// mainmetoden enbart läsa in text och skriva ut resultatet.

import javax.crypto.spec.PSource;
import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.Scanner;

public class CorrectWordCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Word ord1 = new Word("Äggsmörgås");
        // Word ord2 = new
        int points = 0;
        System.out.println(ord1.getWord());
        String inOrd1 = scan.nextLine();
        if (inOrd1.equals(ord1.getWord())) {
            System.out.println("Rättstavat bra gjort!!!");
            points++;
        }


    }
}
