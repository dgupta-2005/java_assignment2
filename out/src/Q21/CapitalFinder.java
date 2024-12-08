package Q21;

class NoMatchFoundException extends Exception {
    NoMatchFoundException(String message) {
        super(message);
    }
}

public class CapitalFinder {
    public static void main(String[] args) {
        try {
            String country = args[0];
            switch (country.toLowerCase()) {
                case "usa":
                    System.out.println("Capital: Washington, D.C.");
                    break;
                case "india":
                    System.out.println("Capital: New Delhi");
                    break;
                default:
                    throw new NoMatchFoundException("No match found for country: " + country);
            }
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

