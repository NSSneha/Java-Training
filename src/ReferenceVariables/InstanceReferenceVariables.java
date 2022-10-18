package ReferenceVariables;

public class InstanceReferenceVariables {
    int a =10; //class level variables accessible by any methods in the pgm
    String name = "Sneha";

    public static void main(String[] args) {
        //System.out.println(a); //Non-static field 'a' cannot be referenced from a static context
        InstanceReferenceVariables obj = new InstanceReferenceVariables(); //inorder to overcome above error an object must be created
        System.out.println(obj.a);
        System.out.println(obj.name);
    }
    /* void display(){
        InstanceReferenceVariables obj1 = new InstanceReferenceVariables();
        System.out.println(obj1.name);
        System.out.println(obj1.a);
        int x= 10; //local variable which is particular
    } */
}
