package Q18;

interface Interface1 {
    void method1();

    void method2();
}

interface Interface2 {
    void method3();

    void method4();
}

interface Interface3 {
    void method5();

    void method6();
}

interface NewInterface extends Interface1, Interface2, Interface3 {
    void method7();
}

class ConcreteClass {
    void concreteMethod() {
        System.out.println("Concrete class method.");
    }
}

class CombinedClass extends ConcreteClass implements NewInterface {
    @Override
    public void method1() {
        System.out.println("Method1 from Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Method2 from Interface1");
    }

    @Override
    public void method3() {
        System.out.println("Method3 from Interface2");
    }

    @Override
    public void method4() {
        System.out.println("Method4 from Interface2");
    }

    @Override
    public void method5() {
        System.out.println("Method5 from Interface3");
    }

    @Override
    public void method6() {
        System.out.println("Method6 from Interface3");
    }

    @Override
    public void method7() {
        System.out.println("Method7 from NewInterface");
    }
}

public class InterfaceTest {
    static void takeInterface1(Interface1 obj) {
        obj.method1();
        obj.method2();
    }

    static void takeInterface2(Interface2 obj) {
        obj.method3();
        obj.method4();
    }

    static void takeInterface3(Interface3 obj) {
        obj.method5();
        obj.method6();
    }

    static void takeNewInterface(NewInterface obj) {
        obj.method7();
    }

    public static void main(String[] args) {
        CombinedClass obj = new CombinedClass();
        takeInterface1(obj);
        takeInterface2(obj);
        takeInterface3(obj);
        takeNewInterface(obj);
    }
}

