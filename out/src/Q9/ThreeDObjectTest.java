package Q9;

abstract class ThreeDObject {
    abstract double volume();

    abstract double wholeSurfaceArea();
}

class Box extends ThreeDObject {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double volume() {
        return length * width * height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}

class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double volume() {
        return Math.pow(side, 3);
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }
}

public class ThreeDObjectTest {
    public static void main(String[] args) {
        ThreeDObject box = new Box(2, 3, 4);
        ThreeDObject cube = new Cube(3);

        System.out.println("Box Volume: " + box.volume());
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
    }
}

