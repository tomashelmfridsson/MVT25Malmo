package smaUppgifterIJava;

// 31. Skapa ett program där talen 1 till 10 skrivs ut.
public class Uppgift31 {
    public static void main(String[] args) {
        // while for
        int tal = 10;
        System.out.print("While varianten: ");
        while (tal >= 1) {
            System.out.print(11- tal + " ");
            tal--;
        }
        System.out.println();
        // for(start; villkor; stegning)
        System.out.print("for varianten: ");
        for(int index=1;index<=10; index++) System.out.print(index+" ");

    }
}
