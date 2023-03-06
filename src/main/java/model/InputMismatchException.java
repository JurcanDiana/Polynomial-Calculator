package model;

public class InputMismatchException extends Exception{

    /**
     * InputMismatchException class
     *
     * Prints the following text in the terminal
     * when encountering wrong input in the text fields.
     *
     */

    public InputMismatchException() {

        super("\n\nThe input is incorrect."
                + "\nPlease provide a polynomial of this form:\n"
                + "c1x^p1+c2x^p2+c3x^p3, where c = coefficients, p = powers(non-negative)"
                + "\nPlease do not enter any spaces between the characters.\n"
                + "\nInstead of writing '-', please enter '+-'");
    }
}
