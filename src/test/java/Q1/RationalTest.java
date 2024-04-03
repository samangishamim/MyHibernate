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
        Rational r1 = new Rational(3, 4);
        Rational r2 = new Rational(1, 4);
        Rational result = r1.sub(r2);
        assertEquals("1/2", result.toString());
    }

    @Test
    void testMul() {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(3, 4);
        Rational result = r1.mul(r2);
        assertEquals("1/2", result.toString());
    }

    @Test
    void testDiv() {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);
        Rational result = r1.div(r2);
        assertEquals("3/2", result.toString());
    }

    @Test
    void testToFloatingPoint() {
    }
}