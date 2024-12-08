package Q24;

class TooOlderException extends Exception {
    TooOlderException(String message) {
        super(message);
    }
}

class TooYoungerException extends Exception {
    TooYoungerException(String message) {
        super(message);
    }
}

public class RecruitmentSystem {
    public static void main(String[] args) {
        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age > 45) throw new TooOlderException("Candidate is too old!");
            if (age < 20) throw new TooYoungerException("Candidate is too young!");
            System.out.println("Eligible Candidate: " + name);
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println(e.getMessage());
        }
    }
}

