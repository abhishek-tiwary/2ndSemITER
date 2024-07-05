class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name= name;
        this.age= age;
    }

}

class Employee extends Person{
    int EmpID;
    double salary;

    Employee(String name, int age, int EmpID, double salary){
        super(name, age);
        this.EmpID= EmpID;
        this.salary= salary;
    }

    void empDisplay(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + EmpID);
        System.out.println("Salary: " + salary);
    }
}

class Q5_EmployeeDetails {
    public static void main(String[] args) {
        Employee e1= new Employee("Abhishek", 20, 001, 1000000);
        Employee e2= new Employee("Yuvraj", 19, 002, 1000001);
        Employee e3= new Employee("Tushar", 18, 003, 10000003);
        e1.empDisplay();
        e2.empDisplay();
        e3.empDisplay();
    }
    
}
