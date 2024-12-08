package Q8;


    class Parent {
        static void display() {
            System.out.println("Parent static method");
        }
    }

    class Child extends Parent {
        static void display() {
            System.out.println("Child static method");
        }
    }

    public class MethodHiding {
        public static void main(String[] args) {
            Parent.display();
            Child.display();
        }
    }


