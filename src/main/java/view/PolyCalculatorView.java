package view;

import controller.Controller;

import javax.swing.*;

public class PolyCalculatorView extends JFrame {

    private JPanel panel;
    //text fields
    private JTextField firstPolyText;
    private JTextField secondPolyText;
    private JTextField resultText;
    //empty text field buttons
    private JButton emptyFirstFieldButton;
    private JButton emptySecondFieldButton;
    private JButton emptyResultFieldButton;
    //operation buttons
    private JButton additionButton;
    private JButton subtractionButton;
    private JButton derivativeButton;
    private JButton integrationButton;
    //exit button
    private JButton exitButton;

    public PolyCalculatorView() {

        /**
         * PolyCalculatorView class
         *
         * Displays the following components on the user interface:
         *              fields for text
         *              exit button
         *              operation buttons
         *
         */

        super("Polynomial Calculator");
        setContentPane(panel);
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //frame on the center
        setVisible(true);

        Controller controller = new Controller(this);

        //exit application
        controller.exit(exitButton);

        //operations
        controller.addition(additionButton);
        controller.subtract(subtractionButton);
        controller.derivate(derivativeButton);
        controller.integrate(integrationButton);

        //empty fields of text
        controller.emptyFirst(emptyFirstFieldButton);
        controller.emptySecond(emptySecondFieldButton);
        controller.emptyResult(emptyResultFieldButton);
    }

    public JButton getEmptyFirstFieldButton() {
        return emptyFirstFieldButton;
    }

    public JButton getEmptySecondFieldButton() {
        return emptySecondFieldButton;
    }

    public JButton getEmptyResultFieldButton() {
        return emptyResultFieldButton;
    }

    public JButton getAdditionButton() {
        return additionButton;
    }

    public JButton getSubtractionButton() {
        return subtractionButton;
    }

    public JButton getDerivativeButton() {
        return derivativeButton;
    }

    public JButton getIntegrationButton() {
        return integrationButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JTextField getFirstPolyText() {
        return firstPolyText;
    }

    public JTextField getSecondPolyText() {
        return secondPolyText;
    }

    public JTextField getResultText() {
        return resultText;
    }
}
