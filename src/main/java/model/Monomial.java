package model;

public class Monomial {

    /**
     * Monomial class
     *
     * Contains mostly just getters and setters
     * useful for accessing the degree and coefficient of a monomial.
     *
     */

    public double coefficient;
    public int degree;

    public Monomial(double coefficient, int degree) {
        this.coefficient = coefficient;
        this.degree = degree;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}
