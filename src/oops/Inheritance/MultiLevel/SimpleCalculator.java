package oops.Inheritance.MultiLevel;

import java.util.Scanner;

public class SimpleCalculator {
    float add(float a, float b){
        return a+b;
    }
}
class AdvancedCalculator extends SimpleCalculator{
    float sub(float a, float b){
        return a-b;
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    float mul(float a, float b){
        return a*b;
    }
    float div(float a,float b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the two number: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        SuperAdvancedCalculator calc = new SuperAdvancedCalculator();
        System.out.println("Addition: " + calc.add(num1, num2));//user I/P num1 & num2 are passed
        System.out.println("Subtraction: " + calc.sub(num1, num2));
        System.out.println("Multiplication: " + calc.mul(num1, num2));
        System.out.println("Division: " + calc.div(num1, num2));
    }
}