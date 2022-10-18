package ControlStatements.loopingStatements.whileLoops;

public class WhileLoopExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        int i = 20;

        /* while (a < 10){
            System.out.println(a); // does not print a as the condition is not satisfies
        }
        while (b < 10) {
            System.out.println(b);
            b += 1;
        } */
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
