public class Lab_18Mar2026_Abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}

abstract class Vehicle {
    abstract void start();  // no body
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}
