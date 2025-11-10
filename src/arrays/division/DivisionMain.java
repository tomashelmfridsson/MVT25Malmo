package arrays.division;

import java.util.Scanner;

public class DivisionMain {

    public static void main(String[] args) {

        Division myDivision = new Division();
        myDivision.tal = 5;
        System.out.println(myDivision.tal);

        Division isaDivision = new Division();
        isaDivision.tal= 7;

        System.out.println(myDivision.tal);

        myDivision.tal = 9;
        System.out.println(isaDivision.tal);




        Scanner myScan = new Scanner(System.in);
        System.out.print("Mata in Täljaren: ");
        int taljare = myScan.nextInt();
        System.out.print("Mata in Nämnaren: ");
        int namnare = myScan.nextInt();
        int[] minArray= {taljare,namnare};
        System.out.println("Kvoten är: "
                +Division.division(minArray));
    }
}
