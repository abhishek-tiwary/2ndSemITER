// Interface DetailInfo
interface DetailInfo {
    void display();
    int count();
}

// Class Person implementing DetailInfo interface
class Person1 implements DetailInfo {
    String name;

    // Constructor
    public Person1(String name) {
        this.name = name;
    }

    // Method to display name of person
    public void display() {
        System.out.println("Name: " + name);
    }

    // Method to count the number of characters in name
    public int count() {
        return name.length();
    }

    // Static data member
    public static int maxcount = 100; // Default value
}

public class Q7_PersonMaxChar {
    public static void main(String[] args) {
        // Creating an instance of Person class
        Person1 person = new Person1("John");

        // Displaying name of person
        person.display();

        // Counting characters in name
        int charCount = person.count();
        System.out.println("Number of characters in name: " + charCount);
    }
}