import java.util.Scanner;
public class Q03_SpyNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();
        int sum=0;
        int product=1;
        while(num!=0){
            int d= num%10;
            sum+=d;
            product*=d;
            num=num/10;
        }
        if(sum==product){
            System.out.println("It is a spy number");
        }
        else{
            System.out.println("Not a spy number");
        }
        sc.close();
    }
}
