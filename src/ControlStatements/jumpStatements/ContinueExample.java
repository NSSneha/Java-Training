package ControlStatements.jumpStatements;

public class ContinueExample {
    public static void main(String[] args) {

        for (int value = 0; value < 10; value++){
            if (value == 5) { //cond is not true, once cond is true it continues by skipping true scenario
                continue;
            }
            System.out.println(value);
        }
    }
}

