package oops.Encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Sneha");
        s1.setRollNo(47);
        s1.setAge(29);

        System.out.println(" Name: " + s1.getName() + " Roll NO: " + s1.getRollNo() + " Age: " + s1.getAge());

    }
}
