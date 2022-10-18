package DateClassExamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateAndTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        //before formatting
        System.out.println("Data before formatting: " + obj);

        //for formatting date and time
/*obj is created*/
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E, MMM dd yyyy"); //MMMM is gvn complete month name will be displayed
        String requiredFormat = obj.format(format); //abv created format is used here
        System.out.println("Data after formatting: " + requiredFormat); //requiredFormat is a string var created
    }
}
