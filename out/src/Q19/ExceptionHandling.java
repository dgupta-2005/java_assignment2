package Q19;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // Will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

