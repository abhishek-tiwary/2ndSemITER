import java.util.Scanner;
public class Q08_2DArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for your array");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int sum=0;
        int arr[][]= new int[r][c];
        System.out.println("Enter the " + r*c + " elements of your array");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]= sc.nextInt();
                sum= sum + arr[i][j];
            }
        }
        System.out.println("The elements of the 2D Array are: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of the elements is " + sum);
        sc.close();
    }
}
