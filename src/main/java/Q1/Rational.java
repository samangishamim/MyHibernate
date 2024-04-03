package Q1;

public class Rational {

    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Rational add(Rational num) {
        int lcm = lcm(this.denominator, num.denominator);
        int n1 = this.numerator * (lcm / this.denominator);
        int n2 = num.numerator * (lcm / num.denominator);
        return new Rational(n1 + n2, lcm);
    }

    public Rational sub(Rational num) {
        int lcm = lcm(this.denominator, num.denominator);
        int n1 = this.numerator * (lcm / this.denominator);
        int n2 = num.numerator * (lcm / num.denominator);
        return new Rational(n1 - n2, lcm);
    }

    public Rational mul(Rational num) {
        int n = this.numerator * num.numerator;
        int d = this.denominator * num.denominator;
        Rational result = new Rational(n, d);
        result.simplify();
        return result;
    }

    public Rational div(Rational num) {
        int n = this.numerator * num.denominator;
        int d = this.denominator * num.numerator;
        return new Rational(n, d);
    }

    public double toFloatingPoint() {
        return (double) numerator / denominator;
    }

    public String toString() {

        if (this.denominator == 0) {

            return String.valueOf(this.numerator);

        } else {

            return this.numerator + "/" + this.denominator;

        }

    }

    public void showCompoundFraction() {
        if (this.numerator <= this.denominator)
            System.out.println(this);
        int n = this.numerator / this.denominator;
        int r = this.numerator % this.denominator;
        System.out.println(n + " + " + r + " / " + this.denominator);
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public void simplify() {
        int gcd = gcd(Math.abs(numerator), denominator);
        numerator /= gcd;
        denominator /= gcd;
    }


    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
