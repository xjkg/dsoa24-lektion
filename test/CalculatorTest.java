import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        calculator.multiply(3,5);
        assertEquals(15, calculator.getResult());
    }

    @Test
    void testMultiply2() {
        Calculator calculator = new Calculator();
        calculator.multiply(3,5,5);
        assertEquals(75, calculator.getResult());
    }
}