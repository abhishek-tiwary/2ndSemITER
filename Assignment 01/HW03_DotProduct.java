import java.util.Scanner;
public class HW03_DotProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter number of elements of array ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        System.out.println("Enter "+n+" elements of array a ");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("Enter "+n+" elements of array b ");
        for(int i=0;i<n;i++){
            b[i]= sc.nextInt();
        }
        System.out.println("Array c is: a.b");
        for(int i=0;i<n;i++){
            c[i]=a[i]*b[i];
            System.out.print(c[i]+" ");
        }
        sc.close();
    }
}
