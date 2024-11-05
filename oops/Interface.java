interface Vehicle {
    void start();
    void stop();
    default void honk() {
        System.out.println("Vehicle is honking!");
    }
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
    public void stop() {
        System.out.println("Car is stopping...");
    }
}
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.honk(); 
        car.stop();  

        Vehicle bike = new Bike();
        bike.start();
        bike.honk();
        bike.stop();
    }
}
