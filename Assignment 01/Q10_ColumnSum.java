import java.util.Scanner;
public class Q10_ColumnSum {
    public static double sumColumn(double[][] m, int columnIndex){
        double sum=0;
        for(int i=0; i<m.length; i++){
            sum= sum+ m[i][columnIndex];
        }
        return sum;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of your array");
        int r= sc.nextInt();
        int c= sc.nextInt();
        double arr[][]= new double[r][c];
        System.out.println("Enter the " + r*c + " elements of your array");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        
        for(int j=0; j<c; j++){
            System.out.println("The sum of elements of column " + j + " is: " + sumColumn(arr, j));
        }
        sc.close();
    }   
}
