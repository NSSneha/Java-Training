package oops.Inheritance.SingleLevel;

public class Animal { //parent class
    void eat(){
        System.out.println("I am eating pedigree..");
    }
    public void run(){
        System.out.println("I am running");
    }
}
//child class "Dog"

class Dog extends Animal { //extends keyword is used to inherit from animal class
    public static void main(String[] args) {
        Dog d1 = new Dog(); //object is created to access parent class method
        d1.eat();
        d1.run();
    }
}