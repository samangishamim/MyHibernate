package Q1;

import org.checkerframework.checker.units.qual.N;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalTest {


    @Test
    void test_getter(){
        Rational r1=new Rational(1,2);
        assertEquals(1,r1.getNumerator());
        assertEquals(2,r1.getDenominator());
    }

    @Nested
    class gcdTest {
        @Test
        void test_gcdTest_divideByZero() {
            Rational r1 = new Rational(1, 0);
            assertEquals(1, r1.gcd(1, 0));
            assertTrue(r1.isDivideByZero());
        }

        @Test
        void test_gcdTest_normalCase() {
            Rational r1 = new Rational(1, 2);
             r1.simplify();
            assertEquals("1/2", r1.toString());
            assertFalse(r1.isDivideByZero());
        }
    }

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
        Rational r = new Rational(1, 2);
        assertEquals(0.5, r.toFloatingPoint());
    }
}