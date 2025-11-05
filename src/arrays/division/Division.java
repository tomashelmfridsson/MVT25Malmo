package arrays.division;

public class Division {
    public static Double division(int[] inputArray){
        if (inputArray.length != 2) {
            System.out.println("Måste ha 2 inparametrar i arrayen");
            return null;
        }
        if (inputArray[1]==0) {
            System.out.println("Noll ej ok i nämnaren");
            return null;
        }
        if (inputArray[1]<0) inputArray[1] = -inputArray[1];
        return (double) (inputArray[0]/inputArray[1]);
    }
}
