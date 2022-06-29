public class Main {
    public static void main(String[] args) {
        sum(1, 2, 3);
        Car car1 = new Car(2);
        Car car2 = new Car();

        System.out.println("Car1 doors: " + car1.getNumDoors());
        System.out.println("Car2 doors: " + car2.getNumDoors());

        car1.incrementNumDoors();
        car2.incrementNumDoors(2);

        System.out.println("Car1 doors after increasing: " + car1.getNumDoors());
        System.out.println("Car2 doors after increasing: " + car2.getNumDoors());
    }
    public static void sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("El resultado de " + a + " + " + b + " + " + c + " es: " + result);
    }

    public static class Car {
        private int numDoors;

        public Car() {
            this.numDoors = 0;
        }

        public Car(int numDoors) {
            this.numDoors = numDoors;
        }

        public void incrementNumDoors() {
            this.numDoors++;
        }

        public void incrementNumDoors(int increment) {
            this.numDoors += numDoors;
        }

        public int getNumDoors() {
            return numDoors;
        }
    }
}