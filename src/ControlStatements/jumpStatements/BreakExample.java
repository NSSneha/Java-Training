package ControlStatements.jumpStatements;

public class BreakExample {
    public static void main(String[] args) {
        for (int value = 0; value < 10; value++){
            if (value == 5) { //cond is not true
                break;
            }
            System.out.println(value);
        }
    }
}
