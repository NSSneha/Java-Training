package ExceptionHandling;

public class E2 {
    //throw keyword is used to throw user defined exceptions
    static void ageCheck(int age){
        if (age < 18){
            throw new ArithmeticException("Access Denied - Age is less than 18");
        }
        else {
            System.out.println("Access Granted - You are eligible");
        }
    }

    public static void main(String[] args) {
        ageCheck(17);
    }
}
