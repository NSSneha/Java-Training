package oops.Inheritance.MultipleInheritance;

interface FirstInterface {
    public void method1();
}
interface SecondInterface {
    public void method2();
}
interface ThirdInterface {
    public void method3();
}
//best example: webdriver interface
class MLDemo implements FirstInterface, SecondInterface, ThirdInterface{
    public void method1() {
        System.out.println("Chrome Browser");
    }
    public void method2() {
        System.out.println("Safari");
    }
    public void method3() {
        System.out.println("FireFox Browser");
    }
}
class MLExample {
    public static void main(String[] args) {
        MLDemo mld = new MLDemo();
        mld.method1();
        mld.method2();
        mld.method3();
    }
}

