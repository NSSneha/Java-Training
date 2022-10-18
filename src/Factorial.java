import java.util.Scanner;

public class Factorial {

        //method 2 using method
        public static int factorial ( int n){
            if (n < 0) {
                return -1; //to input an invalid data we return -1
            }
            else if (n == 0 || n == 1) {
                return 1;
            }
            else {
                return n * factorial(n - 1); //Recursion : a func calling itself again and again
            }
        }
        public static void main(String[] args){
            int fact = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Factorial of negative nos is invalid.");
            }
            else if (n == 0 || n == 1) {
                System.out.println("factorial of " + n + " is " + fact);
            }
            else {
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
                System.out.println("The factorial of number " + n + " is " + fact);
            }
            System.out.println("Method factorial : " + factorial(n));
        }
    }
