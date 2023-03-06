package controller;

import model.InputMismatchException;
import model.Monomial;
import model.Operations;
import model.Polynomial;
import view.PolyCalculatorView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller {

    /**
     * Controller class
     *
     * Implements following buttons:
     *      exit
     *      addition, subtraction, derivation, integration
     *      empty fields for 1st polynomial, 2nd polynomial, result polynomial
     *
     */


    private PolyCalculatorView view;
    public Operations operation = new Operations();

    public Controller(PolyCalculatorView view) {
        this.view = view;
    }

    //exit application
    public void exit(JButton exitButton) {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    //operations
    public void addition(JButton additionButton) {
        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String polynomial1 = view.getFirstPolyText().getText();
                String polynomial2 = view.getSecondPolyText().getText();

                Polynomial poly1 = new Polynomial();
                Polynomial poly2 = new Polynomial();
                Polynomial result = new Polynomial();

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

                result = operation.addition(poly1, poly2);
                view.getResultText().setText(result.toString());
            }
        });
    }

    public void subtract(JButton subtractionButton) {
        subtractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String polynomial1 = view.getFirstPolyText().getText();
                String polynomial2 = view.getSecondPolyText().getText();

                Polynomial poly1 = new Polynomial();
                Polynomial poly2 = new Polynomial();
                Polynomial result = new Polynomial();

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

                result = operation.subtract(poly1, poly2);
                view.getResultText().setText(result.toString());
            }
        });
    }

    public void derivate(JButton derivationButton) {
        derivationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String polynomial = view.getFirstPolyText().getText();

                Polynomial poly = new Polynomial();
                Polynomial result = new Polynomial();

                ArrayList<Monomial> listOfMonomials = null;
                try {
                    listOfMonomials = poly.getMonomials(polynomial);
                } catch (InputMismatchException ex) {
                    ex.printStackTrace();
                }

                poly.setPolynomial(listOfMonomials);

                result = operation.derivate(poly);
                view.getResultText().setText(result.toString());
            }
        });
    }

    public void integrate(JButton integrateButton) {
        integrateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String polynomial = view.getFirstPolyText().getText();

                Polynomial poly = new Polynomial();
                Polynomial result = new Polynomial();

                ArrayList<Monomial> listOfMonomials = null;
                try {
                    listOfMonomials = poly.getMonomials(polynomial);
                } catch (InputMismatchException ex) {
                    ex.printStackTrace();
                }

                poly.setPolynomial(listOfMonomials);

                result = operation.integrate(poly);
                view.getResultText().setText(result.toString());
            }
        });
    }

    //empty fields buttons
    public void emptyFirst(JButton emptyFirstFieldButton) {
        emptyFirstFieldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getFirstPolyText().setText("");
                //textfield.setText(null); //or use this
            }
        });
    }

    public void emptySecond(JButton emptySecondFieldButton) {
        emptySecondFieldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getSecondPolyText().setText("");
            }
        });
    }

    public void emptyResult(JButton emptyResultFieldButton) {
        emptyResultFieldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.getResultText().setText("");
                //textfield.setText(null); //or use this
            }
        });
    }
}
