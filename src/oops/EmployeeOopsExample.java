package oops;

public class EmployeeOopsExample {
    String name;
    int empId;
    int salary;

    public EmployeeOopsExample(String name, int empId, int salary){ //parameterised constructor
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        System.out.println("I am inside a constructor");
    }

    //void display(String name, int empId, int salary)
     void display(){
        System.out.println(this.empId + " " + this.name + " "+ this.salary);
    }

    public static void main(String[] args) { //object creation
        EmployeeOopsExample emp1 = new EmployeeOopsExample("Sneha", 1, 60000); //class name with
        EmployeeOopsExample emp2 = new EmployeeOopsExample("Swathi", 2, 70000);
        EmployeeOopsExample emp3 = new EmployeeOopsExample("Taru", 3, 80000);
        emp1.display();
        emp2.display();
        emp3.display();
    }
}
