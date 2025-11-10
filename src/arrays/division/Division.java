package arrays.division;

public class Division {

    public static int tal;

    public static String division(int[] inputArray){
        if (inputArray.length != 2) {
            return "Måste ha 2 inparametrar i arrayen";
        }
        if (inputArray[1]==0) {
            return "Noll ej ok i nämnaren";
        }
        if (inputArray[1]<0) inputArray[1] = Math.abs(inputArray[1]);
        return String.valueOf (inputArray[0]/inputArray[1]);  // testfall 1
    }
}
