package oops.Polymorphism.Overrinding;

//Method Overriding

public class ReserveBankOfIndia { //parent class ; the governing body
    int rateOfInterest(){
        return 5;
    }
}
class HDFC extends ReserveBankOfIndia{ //taking method from parent class & using in child class
    int rateOfInterest(){
        return 6;
    }
}
class HSBC extends ReserveBankOfIndia {
    int rateOfInterest(){
        return 7;
    }
}
class Axis extends ReserveBankOfIndia {
    int rateOfInterest(){
        return 8;
    }
}
class Banking {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        HSBC hsbc = new HSBC();
        Axis axis = new Axis();
        System.out.println("The ROI of HDFC is: " + hdfc.rateOfInterest()); //ROI rate of interest
        System.out.println("The ROI of HSBC is: " + hsbc.rateOfInterest());
        System.out.println("The ROI of Axis is: " + axis.rateOfInterest());

    }



}