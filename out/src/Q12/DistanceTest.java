package Q12;


    class Distance {
    double miles;

    Distance(double miles) {
        this.miles = miles;
    }

    void travelTime() {
        System.out.println("Time (60 mph): " + (miles / 60) + " hours");
    }
}

    class DistanceMKS extends Distance {
        DistanceMKS(double kilometers) {
            super(kilometers);
        }

        @Override
        void travelTime() {
            System.out.println("Time (100 km/h): " + (miles / 100) + " hours");
        }
    }
    public class DistanceTest {
        public static void main(String[] args) {
            Distance obj1 = new Distance(120);
            DistanceMKS obj2 = new DistanceMKS(200);
            obj1.travelTime();
            obj2.travelTime();
        }
    }


