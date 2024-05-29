import java.util.Scanner;

public class Q01_DivisibleBy2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number greater than 2");
        int a= sc.nextInt();
        int counter=0;
        if(a>2){
            while(a>2){
                a=a/2;
                counter++;
            }
        }
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is " + counter);
        sc.close();
    }
}