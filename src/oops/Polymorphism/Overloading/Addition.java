package oops.Polymorphism.Overloading;

public class Addition {
    static int add(int a, int b){ //static keyword is used for better memory management
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static int add(int a, int b, int c,int d){ //no object creation is reqd if static keyword is used
        return a+b+c+d;
    }
    static float add(float a,float b, float c){ //data types & arguments can change
        return a+b+c;
    }

    /*  public static void main(String[] args) {
        System.out.println("Add 2 nos: " + add(10, 30));
        System.out.println("Add 3 nos: " + add(10, 20, 30));
        System.out.println("Add 4 nos: " + add(10, 20, 30,40));

    } */
}
/* static methods can be accessed from inside a class without object
    static method belongs to the class & not any particular object
    static methods can be accessed outside a class by using the class name
*/
class OverLoadingExample{
    public static void main(String[] args) {
        System.out.println(Addition.add(1,2)); //class_name.method_name
        System.out.println(Addition.add(1,2,3));
        System.out.println(Addition.add(1,2,3,4));
    }
}