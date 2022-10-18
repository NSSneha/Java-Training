package ReferenceVariables;

public class StaticReferenceVariables {
    static String str1;
    static String str2 = "Sneha";
    static int num1;
    static int num2 = 10;
    static boolean status;

    public static void main(String[] args) {
        System.out.println(str1);
        System.out.println(str2); //o/p sneha
        System.out.println(num1);
        System.out.println(num2); // o/p 10
        System.out.println(status);
        display();
    }
    static void display(){ //static is mandatory because without it display() is not accessible
        System.out.println(num2);
    }

}
