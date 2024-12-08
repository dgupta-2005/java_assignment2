package Q23;

class TooHotException extends Exception {
    TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    TooColdException(String message) {
        super(message);
    }
}

public class TemperatureCheck {
    public static void main(String[] args) {
        try {
            int temp = Integer.parseInt(args[0]);
            if (temp > 35) throw new TooHotException("Temperature is too hot!");
            if (temp < 5) throw new TooColdException("Temperature is too cold!");
            System.out.println("Normal temperature.");
            System.out.println("Temperature in Fahrenheit: " + ((temp * 9 / 5) + 32));
        } catch (TooHotException | TooColdException e) {
            System.out.println(e.getMessage());
        }
    }
}

