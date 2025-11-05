package arrays;

import java.util.Arrays;

public class Backwards {

    public static void main(String[] args) {
        int[] orginalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 11.En array med 10 inlästa tal finns.
        // Lägg över dessa tal i en annan array så att talen
        //kommer i omvänd ordning.
        int[] backwardArray = new int[orginalArray.length];
        for (int i = 0; i < orginalArray.length; i++) {
            backwardArray[orginalArray.length - 1 - i] = orginalArray[i];
        }
        System.out.println(Arrays.toString(orginalArray));
        System.out.println(Arrays.toString(backwardArray));

        //12.Skapa ett program som läser in 10 heltal till en array och sedan skriver ut talen
        //baklänges. Endast en array ska användas.
        for (int i = 0; i < orginalArray.length / 2; i++) {
            int temp = orginalArray[i];
            orginalArray[i] = orginalArray[orginalArray.length - 1 - i];
            orginalArray[orginalArray.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(orginalArray));
    }
}
