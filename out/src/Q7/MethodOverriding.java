package Q7;

class BaseClass {
    void show() {
        System.out.println("Base class method");
    }
}

class DerivedClass extends BaseClass {
    @Override
    void show() {
        System.out.println("Derived class method");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        BaseClass obj = new DerivedClass();
        obj.show();
    }
}

