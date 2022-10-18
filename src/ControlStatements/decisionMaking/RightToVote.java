package ControlStatements.decisionMaking;

public class RightToVote {

    public static void main(String[] args) {
        int age = 29;
        String name = "Sneha";

        if(age >= 18) {
            System.out.println(name + " is eligible for voting");
        }
        else {
            System.out.println(name + " Not eligible for voting");
        }

        String result = (age >= 18) ? "Eligible" : "Not Eligible"; //using ternary operator
        System.out.println(name + " " + result);
    }
}
