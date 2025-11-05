package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FemtioNummer {

    public static void main(String[] args) {

        // Manuellt hårdkodade tal
        int[] nummer = {1, 2, 4, 8, 16, 73, 2, 45645, 234, 4563, 23};  // skriv in 50 tal
        System.out.println(Arrays.toString(nummer));

        // Dubblerar alla tal kräver long då int är för litet för 2^50 (int klarar bara 2^31)
        long[] nbrArr = new long[50];
        // [plats] = värde
        nbrArr[0] = 1;   // startvärde annars har jag inget att dubbla senare
        for (int i = 1; i < 50; i++) {
            nbrArr[i] = nbrArr[i - 1] * 2; // Dubblar föregåendes siffra
        }
        System.out.println(nbrArr);
        for (int i = nbrArr.length-1; i >=0 ; i--) {
            System.out.println(nbrArr[i]);
        }

        // 50 slumpvisa tal mellan -99 och +99
        int[] nbrArrRandom = new int[50];
        for (int i = 0; i < nbrArrRandom.length; i++) {
            nbrArrRandom[i] = (int) ((Math.random() - 0.5) * 2 *100); // Math random ger ett tal mellan 0-1
        }
        int max=0, min=0, sum=0;
        for (int nbr: nbrArrRandom){
            if (nbr>max) max= nbr;
            if (nbr<min) min = nbr;
            sum += nbr;
        }
        System.out.println(Arrays.toString(nbrArrRandom));
        System.out.println(max);
        System.out.println(min);
        System.out.println("medel "+sum/nbrArrRandom.length);

        // Skapar en talföljd med uppräkning [1,2,3,4,5.....49,50}
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length-1; i +=2) {
            numbers[i] = i + 1;
        }
        for(int number: numbers){       // Ett enklare sätt att göra for "alla" talen i en array
            System.out.println(number);
        }
        // Medelvärde = summan / antal

        // Scanner kommer bli jobbig att köra för en array med 50 tal
        // **********************************************************
//        Scanner myScan = new Scanner(System.in);
//        int[] nbrArrScan = new int[50];
//        for (int i = 1; i < 50; i++) {
//            nbrArrScan[i] = myScan.nextInt();
//        }
//        System.out.println(nbrArrScan);

    }

}
