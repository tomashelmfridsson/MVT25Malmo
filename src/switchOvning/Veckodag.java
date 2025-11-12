package switchOvning;


import java.util.Scanner;

public class Veckodag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ange ett nummer ");
        int nummer = scan.nextInt();

        String veckodag="";
        switch (nummer){
            case 1: veckodag = "Måndag"; break;
            case 2: veckodag = "Tisdag"; break;
            case 3: veckodag = "Onsdag"; break;
            case 4: veckodag = "Torsdag"; break;
            case 5: veckodag = "Fredga"; break;
            case 6: veckodag = "Lördag"; break;
            case 7: veckodag = "Söndag"; break;
        }
        System.out.println("nummer "+ nummer+ " har veckodagen "+ veckodag);
    }
}

