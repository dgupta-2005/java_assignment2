package Q13;

class Grandparent {
    void display() {
        System.out.println("I am the grandparent.");
    }
}

class Parent extends Grandparent {
    void show() {
        System.out.println("I am the parent.");
    }
}

class Child extends Parent {
    void print() {
        System.out.println("I am the child.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.show();
        obj.print();
    }
}

