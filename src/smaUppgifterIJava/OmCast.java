package smaUppgifterIJava;

public class OmCast {
    public static void main(String[] args) {
        int tal1= 3;
        int tal2 = 5;
        double tal3 = tal2;
        int tal4 = (int) tal3;

        byte b= 1;  // 1byte stor 1111111
        short s = 32; // 2 byte stor 15 bits
        int i = 2343; // 4 byte 2^31 maxtal
        long l = 3423L; // 8 byte

        float f= 3.14159f; // primitiv type
        double kvot = (double) tal2 /tal1;
        System.out.printf("%.2f",kvot);

        // int -> double
        // ej direkt double -> int
    }
}
