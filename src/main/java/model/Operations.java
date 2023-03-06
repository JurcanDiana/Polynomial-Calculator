package model;

public class Operations {

    /**
     * Operations class
     *
     * Classes:
     *      addition
     *      subtraction
     *      derivate
     *      integrate
     *
     */

    public Operations() {
        //empty constructor
    }

    public Polynomial addition(Polynomial polynomial1, Polynomial polynomial2) {

        Polynomial result = new Polynomial();
        result.listOfMonomials = polynomial1.listOfMonomials;

        for (Monomial mono: polynomial2.listOfMonomials) {

            boolean verify = false;
            for(Monomial res: result.listOfMonomials) {

                if(mono.getDegree() == res.getDegree()) {
                    res.coefficient += mono.getCoefficient();
                    verify = true;
                }
            }
            if(verify == false) {
                result.addMonomialToList(mono);
            }
        }
        return result;
    }

    public Polynomial subtract(Polynomial polynomial1, Polynomial polynomial2) {

        Polynomial result = new Polynomial();
        result.listOfMonomials = polynomial1.listOfMonomials;

        for (Monomial mono: polynomial2.listOfMonomials) {

            boolean verify = false;
            for(Monomial res: result.listOfMonomials) {

                if(mono.getDegree() == res.getDegree()) {
                    res.coefficient -= mono.getCoefficient();
                    verify = true;
                }
            }
            if(verify == false) {
                mono.coefficient *= (-1);
                result.addMonomialToList(mono);
            }
        }
        return result;

    }

    public Polynomial derivate(Polynomial polynomial) {

        for (Monomial mono: polynomial.listOfMonomials) {

            mono.coefficient = mono.coefficient * mono.degree;
            mono.degree = mono.degree - 1;
        }

        return polynomial;
    }

    public Polynomial integrate(Polynomial polynomial) {

        for (Monomial mono: polynomial.listOfMonomials) {

            mono.coefficient = mono.coefficient / (mono.degree + 1);
            mono.degree = mono.degree + 1;
        }

        return polynomial;
    }

}
