class Deposit{
    long principle;
    int time;
    double rate;
    double totalAmt;

    Deposit(){
        principle= 30000;
        time= 5;
        rate= 4.50;
    }

    Deposit(long principle, int time, double rate){
        this.principle= principle;
        this.time= time;
        this.rate= rate;
    }

    Deposit(long principle, int time){
        this.principle= principle;
        this.time= time;
        this.rate= 6.78;
    }

    Deposit(long principle, double rate){
        this.principle= principle;
        this.rate= rate;
        this.time= 10;
    }

    void Display(){
        System.out.println("Principle= " + principle);
        System.out.println("Rate= " + rate);
        System.out.println("Time= " + time);
        System.out.println("Total amount= " + calcAmt());
        System.out.println();
    }

    double calcAmt(){
        totalAmt= principle + ((principle*rate*time)/100);
        return totalAmt;
    }
}
public class Q4_SimpleInterest {
    public static void main(String[] args) {
        Deposit ob1= new Deposit();
        Deposit ob2= new Deposit(20000, 8, 12.4);
        Deposit ob3= new Deposit(15000, 3);
        Deposit ob4= new Deposit(10000, 8.95);

        ob1.Display();
        ob2.Display();
        ob3.Display();
        ob4.Display();

    }
}
