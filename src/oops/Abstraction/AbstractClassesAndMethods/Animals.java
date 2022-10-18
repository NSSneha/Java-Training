package oops.Abstraction.AbstractClassesAndMethods;

abstract class Animals{
    //Abstract method
    public abstract void sound(); //abstract method does not have a body

    //Normal method, abstract can contain both abstract and normal methods
    void run(){
        System.out.println("the animal runs...");
    };
}
class Turtle extends Animals{ //child class has the body of abstract method

    public void sound() {
        System.out.println("The turtle moves very slowly");
    }
}
class Cheetah extends Animals{

    public void sound() {
        System.out.println("The Cheetah runs very fast...");

    }
}
class Abstraction {
    public static void main(String[] args) {
        Turtle tur = new Turtle();
        tur.sound();
        tur.run();
        Cheetah c1 = new Cheetah();
        c1.sound();
        c1.run();
    }
}