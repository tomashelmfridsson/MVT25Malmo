package switchOvning;


import java.util.Scanner;

public class Veckodag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ange ett nummer ");
        int nummer = scan.nextInt();

        String veckodag="";
        switch (nummer){
            case 1: veckodag = "Måndag";
            case 2: veckodag = "Tisdag";
            case 3: veckodag = "Onsdag";
            case 4: veckodag = "Torsdag";
            case 5: veckodag = "Fredga";
            case 6: veckodag = "Lördag";
            case 7: veckodag = "Söndag";
            Default: veckodag = "Felaktigt nummer, ingen veckodag kopplad till det numret";
        }
        System.out.println("nummer "+ nummer+ " har veckodagen "+ veckodag);
    }
}

