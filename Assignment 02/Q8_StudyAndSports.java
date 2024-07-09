import java.util.Scanner;
// package student
 class Student {
    String name;
    int roll;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        sc.close();
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
    }
}

class Test extends Student {
    protected int mark1;
    protected int mark2;

    // Method to input details
    public void inputDetails() {
        super.inputDetails(); // Calling inputDetails() of parent class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark 1: ");
        mark1 = sc.nextInt();
        System.out.print("Enter mark 2: ");
        mark2 = sc.nextInt();
        sc.close();
    }

    // Method to display details
    public void showDetails() {
        super.showDetails(); // Calling showDetails() of parent class
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}
// package sports;
 interface Sports {
    int score1 = 10;
    int score2 = 20;
}

// Another class to find grand total mark & score
//import sports.Sports;
//import student.Student;
 class GrandTotal {
    public static void main(String[] args) {
        Test studentTest = new Test();
        studentTest.inputDetails();

        int grandTotalMarks = studentTest.mark1 + studentTest.mark2;
        System.out.println("Grand Total Marks: " + grandTotalMarks);

        int totalScore = Sports.score1 + Sports.score2;
        System.out.println("Total Score: " + totalScore);
    }
}