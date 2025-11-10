package arrays.division;
// 3.Skapa ett program som läser in siffrorna i ett bråk (täljare och nämnare) till en array
//med två platser. Eftersom det är otillåtet att ha 0 i nämnaren ska ett felmeddelande
//skrivas ut om så är fallet.
//14.Skapa ett program som läser in siffrorna i ett bråk till en array med två platser. Det är
//inte vanligt att man låter nämnaren vara negativ. Om så är fallet ska bråket ändras så att
//nämnaren blir positiv.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testAvDivision() {
        int[] inputArr = {10,2};
        assertEquals(5, Double.parseDouble(Division.division(inputArr)));
    }

    @Test
    public void testAvDivisionMedNollINamnaren() {
        int[] inputArr = {10,0};
        assertEquals("Noll ej ok i nämnaren", Division.division(inputArr));
    }

    @Test
    public void testAvDivisionMedTrePosterIArrayen() {
        int[] inputArr = {10,0,4};
        assertEquals("Måste ha 2 inparametrar i arrayen", Division.division(inputArr));
    }

    // upg 14
    @Test
    public void testAvDivisionMedNegativNamnare() {
        int[] inputArr = {10,-2};
        assertEquals(5, Double.parseDouble(Division.division(inputArr)));
    }


}
