public class Calculator {

    public int add(int operand1, int operand2) {
        return operand1 + operand2;
    }
    public int substract(int operand1, int operand2) {
        return operand1 - operand2;
    }
    public int multiply(int operand1, int operand2) {
        return operand1 * operand2;
    }
    public int divide(int operand1, int operand2) throws DivideByZeroException {
        if (operand2 == 0) {
            throw new DivideByZeroException("Divide by zero!!!");
        }
        return operand1 / operand2;
    }

}
