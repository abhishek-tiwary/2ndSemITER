import java.util.Scanner;
class Complex{
    int real, imag;
    void setData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the real value");
        real= sc.nextInt();
        System.out.println("Enter the imaginary value");
        imag= sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println(real + "+" + imag + "j");
    }

    public Complex add(Complex c1, Complex c2){
        real= c1.real+c2.real;
        imag= c1.imag+ c2.imag;
        return this;
    }

}

public class Q2_ComplexSum {
    public static void main(String[] args) {
        Complex c1= new Complex();
        Complex c2= new Complex();
        Complex c3= new Complex();
        c1.setData();
        c2.setData();
        c1.display();
        c2.display();
        c3.add(c1, c2);
        c3.display();
    }
}
