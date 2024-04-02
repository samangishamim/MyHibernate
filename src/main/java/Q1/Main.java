package Q1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerator and denominator for the first fraction: ");

        int num1 = scanner.nextInt();

        int den1 = scanner.nextInt();


        System.out.println("Enter the numerator and denominator for the second fraction: ");

        int num2 = scanner.nextInt();

        int den2 = scanner.nextInt();


        Rational r1 = new Rational(num1, den1);

        Rational r2 = new Rational(num2, den2);

        System.out.println("Enter the numerator: ");

        int num = scanner.nextInt();

        System.out.println("Enter the denominator: ");

        int den = scanner.nextInt();

        Rational rational = new Rational(num, den);


        System.out.println("Addition result: " + r1.add(r2));

        System.out.println("Subtraction result: " + r1.sub(r2));

        System.out.println("Multiplication result: " + r1.mul(r2));

        System.out.println("Division result: " + r1.div(r2));

        System.out.println("Decimal value of x: " + r1.toFloatingPoint());

        System.out.println("compound: ");
        rational.showCompoundFraction();

    }

}
