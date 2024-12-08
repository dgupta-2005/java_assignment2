package Q16;

class StaticKeyword {
    static int counter = 0; // static variable

    StaticKeyword() {
        counter++;
    }

    static void displayCount() { // static method
        System.out.println("Objects created: " + counter);
    }

    public static void main(String[] args) {
        StaticKeyword obj1 = new StaticKeyword();
        StaticKeyword obj2 = new StaticKeyword();
        StaticKeyword.displayCount();
    }
}

