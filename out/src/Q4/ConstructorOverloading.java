package Q4;

public class ConstructorOverloading {
    int x, y;

    ConstructorOverloading() {
        this.x = 0;
        this.y = 0;
    }

    ConstructorOverloading(int x) {
        this.x = x;
        this.y = 0;
    }

    ConstructorOverloading(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(5);
        ConstructorOverloading obj3 = new ConstructorOverloading(5, 10);

        System.out.println("Object 1: (" + obj1.x + ", " + obj1.y + ")");
        System.out.println("Object 2: (" + obj2.x + ", " + obj2.y + ")");
        System.out.println("Object 3: (" + obj3.x + ", " + obj3.y + ")");
    }
}

