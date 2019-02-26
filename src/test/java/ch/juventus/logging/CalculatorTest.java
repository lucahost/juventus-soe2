package ch.juventus.logging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add() {
        new Calculator().add(3, 4);
    }

}
