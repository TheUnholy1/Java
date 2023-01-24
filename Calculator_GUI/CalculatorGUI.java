import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    private Calculator calculator;

    public CalculatorGUI() {
        // Initialize the calculator
        calculator = new Calculator();

        // Create the text fields for the numbers and the result
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        // Create the buttons
        addButton = new JButton("Add");
        addButton.addActionListener(new AddButtonListener());
        subtractButton = new JButton("Subtract");
        subtractButton.addActionListener(new SubtractButtonListener());
        multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(new MultiplyButtonListener());
        divideButton = new JButton("Divide");
        divideButton.addActionListener(new DivideButtonListener());

        // Create the panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        // Create the panel to hold the text fields
        JPanel textFieldPanel = new JPanel();
        textFieldPanel.add(new JLabel("Number 1:"));
        textFieldPanel.add(num1Field);
        textFieldPanel.add(new JLabel("Number 2:"));
        textFieldPanel.add(num2Field);
        textFieldPanel.add(new JLabel("Result:"));
        textFieldPanel.add(resultField);

        // Add the panels to the frame
        add(buttonPanel, BorderLayout.SOUTH);
        add(textFieldPanel, BorderLayout.CENTER);

        // Set the size and title of the frame
        setSize(500, 150);
        setTitle("Calculator");
    }

    private class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int num1, num2;
            try {
                num1 = Integer.parseInt(num1Field.getText());
                num2 = Integer.parseInt(num2Field.getText());
                int result = calculator.addNumbers(num1, num2);
                resultField.setText(Integer.toString(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(CalculatorGUI.this, "Invalid input");
            }
        }
    }

    private class SubtractButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int num1, num2;
            try {
                num1 = Integer.parseInt(num1Field.getText());
                num2 = Integer.parseInt(num2Field.getText());
                int result = calculator.subtractNumbers(            num1, num2);
                resultField.setText(Integer.toString(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(CalculatorGUI.this, "Invalid input");
            }
        }
    }
    
    private class MultiplyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int num1, num2;
            try {
                num1 = Integer.parseInt(num1Field.getText());
                num2 = Integer.parseInt(num2Field.getText());
                int result = calculator.multiplyNumbers(num1, num2);
                resultField.setText(Integer.toString(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(CalculatorGUI.this, "Invalid input");
            }
        }
    }
    
    private class DivideButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int num1, num2;
            try {
                num1 = Integer.parseInt(num1Field.getText());
                num2 = Integer.parseInt(num2Field.getText());
                int result = calculator.divideNumbers(num1, num2);
                resultField.setText(Integer.toString(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(CalculatorGUI.this, "Invalid input");
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(CalculatorGUI.this, "Cannot divide by zero");
            }
        }
    }

    public static void main(String[] args) {
        CalculatorGUI calculatorGUI = new CalculatorGUI();
        calculatorGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorGUI.setVisible(true);
    }
}

