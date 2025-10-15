package oop.calculator;
// . Skapa ett objekt och anropa metoden addition
// ifrån en main-metod
// Uppdatera din main-metod så att den läser in
// de två talen med Scanner

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        // Input
        Scanner myScanner = new Scanner(System.in); // skapar mitt Scanner objekt
        System.out.print("Skriv in tal1: "); // vill ha input på samma rad därför bara print och ej println
        int tal1 = myScanner.nextInt();
        System.out.print("Skriv in tal2: ");
        int tal2 = myScanner.nextInt();

        //Output
        Calculator calc = new Calculator(tal1,tal2);
        int summa = calc.addition();
        System.out.println("Summan är: "+summa);
        System.out.println("Differensen är: "+calc.subtraktion());
        System.out.println("Kvoten är: "+calc.division());
        System.out.println("Produkten är: "+calc.multiplikation());
    }
}
