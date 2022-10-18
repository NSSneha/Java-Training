package DateClassExamples;

import java.time.LocalTime;

public class DisplayCurrentTime {
    public static void main(String[] args) {
        LocalTime obj = LocalTime.now();
        System.out.println("The local time is : " + obj);
    }
}
