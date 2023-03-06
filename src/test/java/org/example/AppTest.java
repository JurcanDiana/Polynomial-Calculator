package org.example;

import static org.junit.Assert.assertEquals;

import model.InputMismatchException;
import model.Monomial;
import model.Operations;
import model.Polynomial;
import org.junit.Test;
import view.PolyCalculatorView;

import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test 1 :-)
     *
     * First polynomial: 8x^7+-5x^6+-65x^3+3x+-9
     * Second polynomial: 4x^6+15x^4+-8x^2+-12
     *
     */

    @Test
    public void additionTest1() {
        PolyCalculatorView calculator = new PolyCalculatorView();
        Operations op = new Operations();

        String polynomial1 = "8x^7+-5x^6+-65x^3+3x+-9";
        String polynomial2 = "4x^6+15x^4+-8x^2+-12";

        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        ArrayList<Monomial> listOfMonomials1 = null;
        ArrayList<Monomial> listOfMonomials2 = null;
        try {
            listOfMonomials1 = poly1.getMonomials(polynomial1);
            listOfMonomials2 = poly2.getMonomials(polynomial2);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        poly1.setPolynomial(listOfMonomials1);
        poly2.setPolynomial(listOfMonomials2);

        String result = op.addition(poly1, poly2).toString();

        assertEquals("8x^7-x^6-65x^3+3x-21+15x^4-8x^2", result);
    }

    @Test
    public void subtractionTest1() {
        PolyCalculatorView calculator = new PolyCalculatorView();
        Operations op = new Operations();

        String polynomial1 = "8x^7+-5x^6+-65x^3+3x+-9";
        String polynomial2 = "4x^6+15x^4+-8x^2+-12";

        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        ArrayList<Monomial> listOfMonomials1 = null;
        ArrayList<Monomial> listOfMonomials2 = null;
        try {
            listOfMonomials1 = poly1.getMonomials(polynomial1);
            listOfMonomials2 = poly2.getMonomials(polynomial2);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        poly1.setPolynomial(listOfMonomials1);
        poly2.setPolynomial(listOfMonomials2);

        String result = op.subtract(poly1, poly2).toString();

        assertEquals("8x^7-9x^6-65x^3+3x+3-15x^4+8x^2", result);
    }


    @Test
    public void derivateTest1() {
        PolyCalculatorView calculator = new PolyCalculatorView();
        Operations op = new Operations();

        String polynomial1 = "8x^7+-5x^6+-65x^3+3x+-9";
        String polynomial2 = "4x^6+15x^4+-8x^2+-12";

        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        ArrayList<Monomial> listOfMonomials1 = null;
        ArrayList<Monomial> listOfMonomials2 = null;
        try {
            listOfMonomials1 = poly1.getMonomials(polynomial1);
            listOfMonomials2 = poly2.getMonomials(polynomial2);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        poly1.setPolynomial(listOfMonomials1);
        poly2.setPolynomial(listOfMonomials2);

        String result1 = op.derivate(poly1).toString();
        String result2 = op.derivate(poly2).toString();

        assertEquals("56x^6-30x^5-195x^2+3", result1);
        assertEquals("24x^5+60x^3-16x", result2);
    }

    @Test
    public void integrateTest1() {
        PolyCalculatorView calculator = new PolyCalculatorView();
        Operations op = new Operations();

        String polynomial1 = "8x^7+-5x^6+-65x^3+3x+-9";
        String polynomial2 = "4x^6+15x^4+-8x^2+-12";

        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        ArrayList<Monomial> listOfMonomials1 = null;
        ArrayList<Monomial> listOfMonomials2 = null;
        try {
            listOfMonomials1 = poly1.getMonomials(polynomial1);
            listOfMonomials2 = poly2.getMonomials(polynomial2);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        poly1.setPolynomial(listOfMonomials1);
        poly2.setPolynomial(listOfMonomials2);

        String result1 = op.integrate(poly1).toString();
        String result2 = op.integrate(poly2).toString();

        assertEquals("x^8-0.7142857142857143x^7-16.25x^4+1.5x^2-9x", result1);
        assertEquals("0.5714285714285714x^7+3x^5-2.6666666666666665x^3-12x", result2);
    }


    /**
     * Rigorous Test 2 :-)
     *
     * First polynomial: 5x^5+-8x^3+2
     * Second polynomial: 22x^4+-4x^3+-7x+9
     *
     */

    @Test
    public void additionTest2() {
        PolyCalculatorView calculator = new PolyCalculatorView();
        Operations op = new Operations();

        String polynomial1 = "5x^5+-8x^3+2";
        String polynomial2 = "22x^4+-4x^3+-7x+9";

        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        ArrayList<Monomial> listOfMonomials1 = null;
        ArrayList<Monomial> listOfMonomials2 = null;
        try {
            listOfMonomials1 = poly1.getMonomials(polynomial1);
            listOfMonomials2 = poly2.getMonomials(polynomial2);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        poly1.setPolynomial(listOfMonomials1);
        poly2.setPolynomial(listOfMonomials2);

        String result = op.addition(poly1, poly2).toString();

        assertEquals("5x^5-12x^3+11+22x^4-7x", result);
    }

    @Test
    public void subtractionTest2() {
        PolyCalculatorView calculator = new PolyCalculatorView();
        Operations op = new Operations();

        String polynomial1 = "5x^5+-8x^3+2";
        String polynomial2 = "22x^4+-4x^3+-7x+9";

        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        ArrayList<Monomial> listOfMonomials1 = null;
        ArrayList<Monomial> listOfMonomials2 = null;
        try {
            listOfMonomials1 = poly1.getMonomials(polynomial1);
            listOfMonomials2 = poly2.getMonomials(polynomial2);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        poly1.setPolynomial(listOfMonomials1);
        poly2.setPolynomial(listOfMonomials2);

        String result = op.subtract(poly1, poly2).toString();

        assertEquals("5x^5-4x^3-7-22x^4+7x", result);
    }


    @Test
    public void derivateTest2() {
        PolyCalculatorView calculator = new PolyCalculatorView();
        Operations op = new Operations();

        String polynomial1 = "5x^5+-8x^3+2";
        String polynomial2 = "22x^4+-4x^3+-7x+9";

        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        ArrayList<Monomial> listOfMonomials1 = null;
        ArrayList<Monomial> listOfMonomials2 = null;
        try {
            listOfMonomials1 = poly1.getMonomials(polynomial1);
            listOfMonomials2 = poly2.getMonomials(polynomial2);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        poly1.setPolynomial(listOfMonomials1);
        poly2.setPolynomial(listOfMonomials2);

        String result1 = op.derivate(poly1).toString();
        String result2 = op.derivate(poly2).toString();

        assertEquals("25x^4-24x^2", result1);
        assertEquals("88x^3-12x^2-7", result2);
    }

    @Test
    public void integrateTest2() {
        PolyCalculatorView calculator = new PolyCalculatorView();
        Operations op = new Operations();

        String polynomial1 = "5x^5+-8x^3+2";
        String polynomial2 = "22x^4+-4x^3+-7x+9";

        Polynomial poly1 = new Polynomial();
        Polynomial poly2 = new Polynomial();

        ArrayList<Monomial> listOfMonomials1 = null;
        ArrayList<Monomial> listOfMonomials2 = null;
        try {
            listOfMonomials1 = poly1.getMonomials(polynomial1);
            listOfMonomials2 = poly2.getMonomials(polynomial2);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        }

        poly1.setPolynomial(listOfMonomials1);
        poly2.setPolynomial(listOfMonomials2);

        String result1 = op.integrate(poly1).toString();
        String result2 = op.integrate(poly2).toString();

        assertEquals("0.8333333333333334x^6-2x^4+2x", result1);
        assertEquals("4.4x^5-x^4-3.5x^2+9x", result2);
    }
}
