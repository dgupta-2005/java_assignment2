package Q3;

public class ParameterizedConstructor {
    String message;

    ParameterizedConstructor(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor("Hello, World!");
        System.out.println(obj.message);
    }
}


