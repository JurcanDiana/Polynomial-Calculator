package model;

import java.util.ArrayList;

public class Polynomial {

    /**
     * Polynomial class
     *
     * Most important methods:
     *              getMonomials - returns a list of monomials from a given string
     *              toString     - returns a string from a given polynomial
     *
     */

    public ArrayList<Monomial> listOfMonomials = new ArrayList<Monomial>();

    public Polynomial() {
        this.listOfMonomials = new ArrayList<>();
    }

    public void setPolynomial(ArrayList<Monomial> listOfMonomials) {
        this.listOfMonomials = listOfMonomials;
    }

    public ArrayList<Monomial> getPolynomial() {
        return listOfMonomials;
    }

    public void addMonomialToList(Monomial monomial) {
        listOfMonomials.add(monomial);
    }

    private boolean isEmpty() {
        return getPolynomial().isEmpty();
    }

    public int getDegree() {
        return (this.listOfMonomials.size() == 0) ? 0 : this.listOfMonomials.get(0).getDegree();
    }


    //method to get the list of monomials
    public ArrayList<Monomial> getMonomials(String string) throws InputMismatchException {

        ArrayList<Monomial> polynomial = new ArrayList<>();

        string.replaceAll("-", "+-");//replaces all minus signs with "+-"
        String[] str = string.split("\\+");//split the polynomial in a string array of monomials

        //go through every monomial from the polynomial
        for (String monomial : str) {
            //if there are characters in the string proceed
            if (!monomial.equals("")) {
                //split the string in an array of strings according to where "x^" or "x" is
                String[] pair = monomial.split("x\\^|x");

                //if pair has length = 0
                if (pair.length == 0) {
                    //it means we have simple x, so we add a monomial with deg=1,coeff=1
                    polynomial.add(new Monomial(1, 1));
                    //if pair has length = 1
                } else if (pair.length == 1) {
                    //test if pair[0] is not an integer/double
                    if (!pair[0].matches("^[0-9]*$||^[0-9.]*$||^-[0-9]*$||^-[0-9.]*$")) {
                        throw new InputMismatchException();//throw incorrect input exception
                    }
                    //if it contains x
                    if (monomial.contains("x")) {
                        //check if its -x
                        if (monomial.equals("-x")) {
                            //means we have simple -x, so we add a monomial with deg=1,coeff=-1
                            polynomial.add(new Monomial(-1, 1));
                        } else {
                            //else we have a coefficient*x, so we add that coefficient, and deg=1
                            polynomial.add(new Monomial(Double.parseDouble(pair[0]), 1));
                        }
                    } else {
                        //else if we have no x, we have a simple coefficient that we add
                        polynomial.add(new Monomial(Double.parseDouble(pair[0]), 0));
                    }
                    //if pair has a length of 2
                } else if (pair.length == 2) {
                    //check if the monomial has a coefficient
                    if (pair[0].equals("")) {
                        //test if pair[1] is not an integer/double
                        if (!pair[1].matches("^[0-9]*$||^[0-9.]*$||^-[0-9]*$||^-[0-9.]*$")) {
                            throw new InputMismatchException();//throw incorrect input exception
                        }
                        //we have no coefficient, so we add a monomial with coeff=1, and its given deg
                        polynomial.add(new Monomial(1, Integer.parseInt(pair[1])));
                    } else {
                        //test if pair[10] and pair[1] are not an integer/double
                        if (!pair[0].matches("^[0-9]*$||^[0-9.]*$||^-[0-9]*$||^-[0-9.]*$")
                                || !pair[1].matches("^[0-9]*$||^[0-9.]*$||^-[0-9]*$||^-[0-9.]*$")) {
                            throw new InputMismatchException();//throw incorrect input exception
                        }
                        //we will have the standard form of a monomial, so we add its coeff and deg after parsing
                        polynomial.add(new Monomial(Double.parseDouble(pair[0]), Integer.parseInt(pair[1])));
                    }
                }
            }
        }
        return polynomial;
    }

    @Override
    public String toString() {

        //initializing an empty string
        String result = "";

        //if null polynomial return 0
        if(this.isEmpty()) return "0";

        int deg = this.getDegree();

        if (this.listOfMonomials.size() == 0) result += "0";
        else {
            for (Monomial monomial : this.listOfMonomials) {

                if (monomial.coefficient == 0) {
                    result += "";
                } else {
                    if (monomial.degree != deg)  {
                        if(monomial.coefficient > 0) result += "+";
                        else result += "";
                    }

                    if (monomial.coefficient == -1 && monomial.degree != 0) result += "-";

                    if ((monomial.degree >= 1 && monomial.coefficient != 1 && monomial.coefficient != -1) || (monomial.degree == 0)) {
                        if (Math.floor(monomial.coefficient) == monomial.coefficient) result += (int) monomial.coefficient;
                        else result += monomial.coefficient;

                    }

                    if (monomial.degree == 1) result += "x";
                    else if (monomial.degree > 1) result += "x^" + monomial.degree;

                }
            }
        }
        return result;
    }

}

