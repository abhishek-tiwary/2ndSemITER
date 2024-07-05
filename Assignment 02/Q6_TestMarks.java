abstract class Marks {
    int markICP;
    int markDSA;
    double percentage;

    public Marks(int markICP, int markDSA) {
        this.markICP = markICP;
        this.markDSA = markDSA;
    }

    // Abstract method to calculate percentage
    public abstract void getPercentage();
}

class CSE extends Marks {
    int algoDesign;

    public CSE(int markICP, int markDSA, int algoDesign) {
        super(markICP, markDSA);
        this.algoDesign = algoDesign;
    }

    public void getPercentage() {
        percentage = (markICP + markDSA + algoDesign) / 3.0;
        System.out.println("Percentage for CSE student: " + percentage + "%");
    }
}

class NonCSE extends Marks {
    int enggMechanics;

    public NonCSE(int markICP, int markDSA, int enggMechanics) {
        super(markICP, markDSA);
        this.enggMechanics = enggMechanics;
    }

    public void getPercentage() {
        percentage = (markICP + markDSA + enggMechanics) / 3.0;
        System.out.println("Percentage for Non-CSE student: " + percentage + "%");
    }
}

public class Q6_TestMarks {
    public static void main(String[] args) {
        // Creating objects for CSE and NonCSE classes
        CSE cseStudent = new CSE(85, 90, 88);
        NonCSE nonCSEStudent = new NonCSE(78, 82, 75);

        // Calculating and printing percentage for each student
        cseStudent.getPercentage();
        nonCSEStudent.getPercentage();
    }
}