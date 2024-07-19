import java.util.Scanner;
class Commission{
    int sales;
    Commission(int sales){
        this.sales= sales;
    }

    double getCommission(int sales){
        double salesCommission=1;
        if(sales<=100){
            salesCommission= 0.02*sales;
        }
        else if(sales>=500 && sales<5000){
            salesCommission= 0.05*sales;
        }
        else if(sales>=5000){
            salesCommission= 0.08*sales;
        }
        return salesCommission;

    }
}

public class HW01_Sales {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your sales");
        int sales= sc.nextInt();
        if(sales>0){
            Commission c1= new Commission(sales);
            System.out.println("Your commission is " + c1.getCommission(sales));
        }
        else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }

}
