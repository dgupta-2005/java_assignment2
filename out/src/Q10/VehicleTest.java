package Q10;

class Vehicle {
    protected String regnNumber, speed, color, ownerName;

    void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private String routeNumber;

    Bus(String regnNumber, String speed, String color, String ownerName, String routeNumber) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
        this.routeNumber = routeNumber;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Bus Details - Regn: " + regnNumber + ", Speed: " + speed +
                ", Color: " + color + ", Owner: " + ownerName + ", Route: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    Car(String regnNumber, String speed, String color, String ownerName, String manufacturerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
        this.manufacturerName = manufacturerName;
    }

    @Override
    void showData() {
        super.showData();
        System.out.println("Car Details - Regn: " + regnNumber + ", Speed: " + speed +
                ", Color: " + color + ", Owner: " + ownerName + ", Manufacturer: " + manufacturerName);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Bus bus = new Bus("B123", "60km/h", "Yellow", "John", "R10");
        Car car = new Car("C456", "80km/h", "Red", "Alice", "Toyota");

        bus.showData();
        car.showData();
    }
}

