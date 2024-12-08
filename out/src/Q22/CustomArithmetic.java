package Q22;

class DivisionByZeroException extends Exception {
    DivisionByZeroException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}

public class CustomArithmetic {
    public static void main(String[] args) {
        try {
            int a = 10, b = -2;
            if (b == 0) throw new DivisionByZeroException("Division by zero is not allowed.");
            if (b < 0) throw new NegativeNumberException("Negative divisor is not allowed.");
            System.out.println("Result: " + (a / b));
        } catch (DivisionByZeroException | NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

