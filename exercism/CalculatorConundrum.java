package pl.globallogic.exercism;

import java.util.Objects;

public class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        this.validateOperation(operation);
        int result = 0;

        switch (operation) {
            case "*":
                result = multiplication(operand1, operand2);
                break;
            case "/":
                result = divide(operand1, operand2);
                break;
            case "+":
                result = addition(operand1,operand2);
                break;
            default:
                //throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        }
        return String.format("%s %s %s = %s", operand1, operation, operand2, result);
    }
    private void validateOperation(String operation) {
        if (Objects.isNull(operation)) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
    }
    private int multiplication(int operand1, int operand2) {
        return operand1 * operand2;
    }
    private int divide(int operand1, int operand2) {
        try {
            return operand1 / operand2;
        } catch (ArithmeticException ex) {
            throw new IllegalArgumentException(); //IllegalOperationException("Division by zero is not allowed", ex);
        }
    }
    private int addition(int operand1, int operand2) {
        return operand1 + operand2;
    }
}
