package InteractivePrograms;

import java.util.Scanner;

public class AreaOfATriangle {
    public static void main(String[] args) {
    // b,h inputs to be taken from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter breath of the triangle :");
        float breath = sc.nextFloat();

        System.out.println("Enter breath of the triangle :");
        float height = sc.nextFloat();

        float areaOfTriangle = (breath * height)/2; // or formula 0.5*(b*h)
        System.out.println("The area of the triangle is :" +areaOfTriangle);
    }
}
