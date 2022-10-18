package AccessModifiers.P1;


class ABC {
    private int value = 13;
    private void message(){
        System.out.println("Private Method");
    }
}

public class A { //order of class in not mandatory
    public static void main(String[] args) {
        ABC obj = new ABC();
      //  System.out.println(obj.value);
      //  obj.message(); //can not be accessed outside the class because it is private which is at class level
    }

}