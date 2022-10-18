package ControlStatements.loopingStatements.whileLoops;

public class DoWhileExample {
    public static void main(String[] args) {
        int data = 10;

        do{
            System.out.println(data);
            data++; //incremented
        }
         // while (data < 10); //10<10 not satisfied but do part is getting executed.
        while (data < 20); // this cond is satisfied and hence 10 to 19 is printed
    }
}
