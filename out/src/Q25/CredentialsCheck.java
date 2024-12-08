package Q25;

class InvalidCredentialsException extends Exception {
    InvalidCredentialsException(String message) {
        super(message);
    }
}

public class CredentialsCheck {
    public static void main(String[] args) {
        try {
            String username = "user123";
            String password = "pass123";

            if (username.length() < 6) throw new InvalidCredentialsException("Username must be at least 6 characters.");
            if (!password.equals("pass123")) throw new InvalidCredentialsException("Password does not match.");

            System.out.println("Login successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}

