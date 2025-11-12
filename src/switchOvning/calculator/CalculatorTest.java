package switchOvning.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testOfAddition() {
        Calculator myCalculator = new Calculator();
        myCalculator.setX(4);
        myCalculator.setY(6);
        myCalculator.setOperation('+');
        Calculator henrikCalculator = new Calculator();
        henrikCalculator.setOperation('-');
        assertEquals(10, myCalculator.result());

        assertEquals(10, Calculator.resultStatic(3,7,'+'));
    }

}
