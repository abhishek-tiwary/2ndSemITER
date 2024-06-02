import java.util.Scanner;


public class Q05_SumOfDigits {
    public static int sum_Of_Digits(int n){
        int sum=0;
        while(n>0 || sum>9){
            if(n==0){
                n=sum;
                sum=0;
            }
            int d= n%10;
            sum+=d;
            n/=10;
        }
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();
        System.out.println("Sum of digits of " + num + " until the number is a single digit is " + sum_Of_Digits(num));
        sc.close();
    }
    
}
