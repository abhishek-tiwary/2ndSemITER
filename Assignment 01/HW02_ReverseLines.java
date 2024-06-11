import java.util.Scanner;
public class HW02_ReverseLines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of lines ");
        int n= sc.nextInt();
        String[] str=new String[n+1];
        System.out.println("Enter "+ n +" lines");
        for(int i=0;i<n+1;i++) {
            str[i] = sc.nextLine();
        }
        for(int i=n;i>0;i--){
            System.out.println(str[i]);
        }
        sc.close();
    }
}
