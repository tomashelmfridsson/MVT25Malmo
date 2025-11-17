package oop;

import java.util.Scanner;

public class FruitSalad {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Mata in alla frukter speparerade med komma (',')");
        String frukter = scan1.nextLine();
        String Fruits[] = frukter.split(",");

    }
}

