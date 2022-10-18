package InteractivePrograms;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //system.in tells that we need input from the user
        System.out.println("Enter the Principal Amount: ");
        int P = sc.nextInt();
        System.out.println("Enter the Time in years: ");
        int T = sc.nextInt();
        System.out.println("Enter the Rate of interest: ");
        int R = sc.nextInt();

        float SI = (P * T * R)/100;
        System.out.println("The Simple Interest is: " + SI);
    }
}
