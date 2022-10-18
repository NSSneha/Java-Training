package ControlStatements.decisionMaking;

public class NestedIfElse {
    public static void main(String[] args) {
        int marksEnglish = 85;
        int marksMaths = 75;
        String name = "Sneha";

        if (marksEnglish > 80){
            if(marksMaths > 80){
                System.out.println("Congratulations " + name + " You get a cycle.");
            }
            else {
                System.out.println("Congratulations " + name + " You get a bag.");
            }
        }
        else {
            System.out.println("Sorry " + name + " Work hard and get good marks next time.");
        }
    }
}
