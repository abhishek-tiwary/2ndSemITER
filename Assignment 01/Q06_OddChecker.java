import java.util.Scanner;
public class Q06_OddChecker {
    public static boolean isOdd(int n){
        int a= n&1;
        if(a==1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int n= sc.nextInt();
        System.out.println("It is " + isOdd(n) + " that your number is odd");
        sc.close();
    }
}
