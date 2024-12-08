package Q6;

    public class MethodOverloading {
        void display(int a) {
            System.out.println("Integer: " + a);
        }

        void display(String str) {
            System.out.println("String: " + str);
        }

        public static void main(String[] args) {
            MethodOverloading obj = new MethodOverloading();
            obj.display(10);
            obj.display("Hello");
        }
    }


