package oops.Abstraction.AbstractClassesAndMethods;

abstract class Vehicle { //abstract class vehicle is gvn instead of public class scooter because of abstraction
    abstract void start(); //body gvn in its child class
}
class Car extends Vehicle{
    void start() {
        System.out.println("A car starts with the keys");
    }
}
class Scooter extends Vehicle {
    void start() {
        System.out.println("A scooter starts with a kick");
    }
}
class Testing {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        Scooter s = new Scooter();
        s.start();
    }
}