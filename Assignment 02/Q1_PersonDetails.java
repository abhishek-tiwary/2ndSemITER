import java.util.Scanner;

class Person{
    String name;
    int age;
    public void setData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        name= sc.next();
        System.out.println("Enter your age");
        age= sc.nextInt();
        sc.close();
    }
    public void displayData(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
public class Q1_PersonDetails {
    public static void main(String[] args) {
        Person p1= new Person();
        Person p2= new Person();
        p1.name= "Rohan";
        p1.age= 20;
        p2.setData();
        p1.displayData();
        p2.displayData();

        if(p1.age>p2.age){
            System.out.println(p1.name + " is older than " + p2.name);
        }
        else{
            System.out.println(p2.name + " is older than " + p1.name);
        }
    }
}
