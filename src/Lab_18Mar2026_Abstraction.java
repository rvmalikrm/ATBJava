public class Lab_18Mar2026_Abstraction {
    public static void main(String[] args) {
        Car a = new Car();
        a.start();
        a.startwithbody();
    }
}
abstract class Vehicle {
    abstract void start();  // no body

    void startwithbody() {
        System.out.println("Vehicle starts with key");
    }
}
class Car extends Vehicle {
    void start()
    {
        System.out.println("Car starts with key");
    }
}
