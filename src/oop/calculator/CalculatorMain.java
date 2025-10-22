package oop.calculator;
// . Skapa ett objekt och anropa metoden addition
// ifrån en main-metod
// Uppdatera din main-metod så att den läser in
// de två talen med Scanner

// 17 I din main-metod för Calculator skapa ett nytt
// objekt som istället för att läsa in två nya
// tal i 	konstruktorn läser in två tal som
// är hämtade 	ifrån det första objektet.
// T.ex. att man 	använder produkten som
// tal 1 och summan 	som tal 2

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

        System.out.println("Info om calculator 2");
        Calculator calc2 = new Calculator(summa,calc.multiplikation());
        System.out.println("Summan är: "+calc2.addition());
        System.out.println("Differensen är: "+calc2.subtraktion());
        System.out.println("Kvoten är: "+calc2.division());
        System.out.println("Produkten är: "+calc2.multiplikation());

    }
}
