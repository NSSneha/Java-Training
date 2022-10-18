package oops.Abstraction.Interface;

interface InterfaceOfAnimals {
    public void size();
    public void color(); // body for the method in interfaces are defined here, they are done in the body
}

class Panda implements InterfaceOfAnimals{ //implements keyword is used
    public void size(){
        System.out.println("It's size is average");
    }
    public void color(){
        System.out.println("It is black & white in color");
    }
}
class Fox implements InterfaceOfAnimals {
    public void size(){
        System.out.println("It's size is small");
    }
    public void color(){
        System.out.println("It is brown in color");
    }
}
class InterfaceDemo { //normal class
    public static void main(String[] args) {
        Panda p = new Panda();
        Fox f = new Fox();
        p.color();
        p.size();
        f.color();
        f.size();
    }
}