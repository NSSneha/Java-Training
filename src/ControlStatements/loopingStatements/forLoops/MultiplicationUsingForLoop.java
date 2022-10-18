package ControlStatements.loopingStatements.forLoops;

public class MultiplicationUsingForLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i + "x" + j + "=" + i * j + "\t\t"); //System.out.print() to print horizontally. +" " is given for space between each nos
            } //\t for tab spacing
            System.out.println(); // to print in next line "for vertical printing"
        }
    }
}