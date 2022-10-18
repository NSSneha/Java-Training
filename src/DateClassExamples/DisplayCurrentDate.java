package DateClassExamples;

import java.time.LocalDate;

public class DisplayCurrentDate {
    public static void main(String[] args) {
        //create obj of local date class
        LocalDate obj = LocalDate.now(); //no 'new' keyword, instead now method is used
        System.out.println("The current date is: " +obj);
    }
}
