package DateClassExamples;

import java.time.LocalDateTime;

public class DisplayDateAndTime {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("The local date and time are : " + obj);
    }
}
