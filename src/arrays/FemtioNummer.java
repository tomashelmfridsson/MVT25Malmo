package arrays;

import java.util.Scanner;

public class FemtioNummer {

    public static void main(String[] args) {

        int[] nummer = {1, 2, 4, 8, 16, 73, 2, 45645, 234, 4563, 23};  // skriv in 50 tal
        System.out.println(nummer);

        long[] nbrArr = new long[50];
        // [plats] = värde
        nbrArr[0] = 1;   // startvärde annars har jag inget att dubbla senare
        for (int i = 1; i < 50; i++) {
            nbrArr[i] = nbrArr[i - 1] * 2; // Dubblar föregåendes siffra
        }
        System.out.println(nbrArr);
        for (int i = 0; i < nbrArr.length; i++) {
            System.out.println(nbrArr[i]);
        }

        int[] nbrArrRandom = new int[50];
        for (int i = 0; i < nbrArrRandom.length; i++) {
            nbrArrRandom[i] = (int) ((Math.random() - 0.5) * 200);
        }
        for (int i = 0; i < nbrArrRandom.length; i++) {
            System.out.println(nbrArrRandom[i]);
        }

        // [1,2,3,4,5.....49,50}
        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for(int number: numbers){
            System.out.println(number);
        }

//        Scanner myScan = new Scanner(System.in);
//        int[] nbrArrScan = new int[50];
//        for (int i = 1; i < 50; i++) {
//            nbrArrScan[i] = myScan.nextInt();
//        }
//        System.out.println(nbrArrScan);

    }
}
