package smaUppgifterIJava;

//11.Skapa ett program där två tal sparas i variabler
// och det första talet skrivs ut om det är störst.
public class Uppgift11 {

    public static void main(String[] args) {
        int tal1 = skapaTal1();
        int tal2 = 5;
        utskrift(tal1,tal2);
    }

    static int skapaTal1(){
        return 10;
    }

    static void utskrift(int nyaTal1,double nyaTal2) {
        boolean mittVillkor = nyaTal1 > nyaTal2;
        if (mittVillkor) {
            System.out.println("Första talet är störst, Talet är "+nyaTal1);
        }

    }

}
