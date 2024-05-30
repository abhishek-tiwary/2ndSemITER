import java.util.Scanner;
public class Q02_BMI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your height in metres");
        double h= sc.nextDouble();
        System.out.println("Enter your weight in kg");
        double w= sc.nextDouble();
        double BMI= w/(h*h);

        if(BMI<18.5){
            System.out.println("You are underweight");
        }
        else if(BMI>=18.5 && BMI<=24.9){
            System.out.println("Your BMI is normal");
        }
        else if(BMI>=25.0 && BMI<=29.9){
            System.out.println("You are overweight");
        }
        else if(BMI>=30){
            System.out.println("You are obese");
        }
        sc.close();
    }
}
