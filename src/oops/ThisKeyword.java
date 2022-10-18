package oops;

public class ThisKeyword {
    int i; //instance variable
    void setValue(int i){ //local variable belongs to this method
        this.i = i; //this keyword refers to the current class instance variable
    }
    void display(){
        System.out.println(i);
    }
}
class PQR{
    public static void main(String[] args) {
        ThisKeyword t1 = new ThisKeyword();
        t1.setValue(5); //1st the value goes to x, where x = ii
        t1.display();
        ThisKeyword t2 = new ThisKeyword();
        t2.setValue(29);
        t2.display();
    }
}
