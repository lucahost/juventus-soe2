package ch.juventus.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    public static void initAll() {}

    @ParameterizedTest
    @CsvSource({
        "3, 2, 1",
        "4, 1, 3",
        "9, 6, 3"
    })
    public void addition(int expected, int s1, int s2) {
        assertEquals(expected, calculator.add(s1, s2));
    }

    @Test
    public void division() {
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
    }

}
