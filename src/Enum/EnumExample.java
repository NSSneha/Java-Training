package Enum;

public class EnumExample {

    enum TrafficSignal { //enum can be inside or outside the class
        YELLOW,
        RED,
        GREEN;  // semicolon is optional. as they are constraints hence given in upper case

        public static void main(String[] args) {
            TrafficSignal v1 = TrafficSignal.GREEN; //no new keyword is reqd
            TrafficSignal v2 = TrafficSignal.RED;
            TrafficSignal v3 = TrafficSignal.YELLOW;
            System.out.println("The signal is: " + v2);

            //to iterate
            for(TrafficSignal color : TrafficSignal.values()) { //here color is user defined name. values() method is used to print all the values.
                System.out.println(color);
            }
        }
    }
}
