package Q1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalTest {

    @Test
    void testAdd() {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);
        Rational result = r1.add(r2);
        assertEquals("5/6", result.toString());
    }

    @Test
    void testSub() {

    }

    @Test
    void testMul() {
    }

    @Test
    void testDiv() {
    }

    @Test
    void testToFloatingPoint() {
    }
}