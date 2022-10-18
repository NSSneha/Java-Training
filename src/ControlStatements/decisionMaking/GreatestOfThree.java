package ControlStatements.decisionMaking;

public class GreatestOfThree {

    public static void main(String[] args) {

        int a = 13;
        int b = 26;
        int c = 02;

        if(a > b && a > c){
            System.out.println("a is greater , a = " + a);
        }
        else if(b > a && b > c){
            System.out.println("b is greater, b = " + b);
        }
        else{
            System.out.println("c is greater, c = " + c);
        }
    }
}
