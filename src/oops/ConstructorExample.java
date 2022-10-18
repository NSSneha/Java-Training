package oops;

public class ConstructorExample {
    int x;
    int y;
    int z;

    //default constructor
    public ConstructorExample(){
        x = 2;
        y = 3;
    }
    // parameterized constructor
    public ConstructorExample(int a, int b){ //const-->parameterized-->no.of.parameters
        x = a;
        y = b;
    }
    public ConstructorExample(int a, int b,int c){
       // int z= c; if int is gvn ans will be 0, hence initialize abv
        x = a;
        y = b;
        z = c;
    }
    public ConstructorExample(float a, float b,float c) { //const-->parameterized-->type of parameters
        // int z= c; if int is gvn ans will be 0, hence initialize abv
       // x = a; error because x is integer hence type caste
        x = (int) a; //type casting
        y = (int )b;
        z = (int) c;
    }
}
/* public class Demo{} it can not have 2 public classes, hence just create as below
 */
class Demo{
    public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        System.out.println(obj1.x);
        System.out.println(obj1.y);

        //para.const

        ConstructorExample obj2 = new ConstructorExample(10, 20);
        System.out.println(obj2.x);
        System.out.println(obj2.y);

        ConstructorExample obj3 = new ConstructorExample(10, 20, 3);
        System.out.println(obj3.x);
        System.out.println(obj3.y);
        System.out.println(obj3.z);

        ConstructorExample obj4 = new ConstructorExample(10.3f, 20.6f, 3.3f);
        System.out.println(obj4.x);
        System.out.println(obj4.y);
        System.out.println(obj4.z);
    }
}