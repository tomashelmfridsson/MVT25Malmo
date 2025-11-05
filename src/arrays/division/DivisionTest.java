package arrays.division;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testAvDivision() {
        int[] inputArr = {10,2};
        assertEquals(5, Division.division(inputArr));
    }

    @Test
    public void testAvDivisionMedNollINamnaren() {
        int[] inputArr = {10,0};
        assertEquals(null, Division.division(inputArr));
    }

    @Test
    public void testAvDivisionMedTrePosterIArrayen() {
        int[] inputArr = {10,0,4};
        assertEquals(null, Division.division(inputArr));
    }

    // upg 14
    @Test
    public void testAvDivisionMedNegativNamnare() {
        int[] inputArr = {10,-2};
        assertEquals(5, Division.division(inputArr));
    }


}
