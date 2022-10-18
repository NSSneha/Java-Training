package oops.Inheritance.MultiLevel;

public class A {//grandparent
    void displayA(){
        System.out.println("Method of class A");
    }
}
class B extends A { //parent
    void displayB(){
        System.out.println("Methods of class B");
    }
}
class C extends B{
    void displayC(){
        System.out.println("Method of class C");
    }

    public static void main(String[] args) {
        A obj = new A();
        obj.displayA();
        System.out.println("..........................."); //only method of A is accessible
        B obj1 = new B();
        obj1.displayA();
        obj1.displayB();
        System.out.println("..........................."); //method of A and B are accessible
        C obj2 = new C();
        obj2.displayA();
        obj2.displayB();
        obj2.displayC();
        System.out.println("..........................."); //method of A, B & C accessible
    }
}

