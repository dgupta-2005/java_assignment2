package Q26;

class NegativeAgeException extends Exception {
    NegativeAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {
    public static void main(String[] args) {
        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age < 0) throw new NegativeAgeException("Age cannot be negative!");
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

