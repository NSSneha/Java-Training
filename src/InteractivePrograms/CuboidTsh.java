package InteractivePrograms;

import java.util.Scanner;

public class CuboidTsh {
    public static void main(String[] args) {
        // l,b,h inputs to be taken from the user

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the cuboid :");
        float l = sc.nextFloat();

        System.out.println("Enter breath of the cuboid :");
        float b = sc.nextFloat();

        System.out.println("Enter height of the cuboid :");
        float h = sc.nextFloat();

        float tshOfCuboid = 2 * ((l * b) + (b * h) + (l * h));
        System.out.println("The total surface area of a cuboid is :" + tshOfCuboid);
    }
}