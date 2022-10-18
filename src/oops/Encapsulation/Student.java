package oops.Encapsulation;

public class Student {
    private String name; //made private for capsuling/protecting
    private int rollNo;
    private int age;

    //setter and getter methods are used inorder to access the encapsulated variables
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
class Test{
    public static void main(String[] args) {
        Student s1 = new Student();
       // s1.age = 10;                  error because it is protected
       // System.out.println(s1.age);
    }
}
