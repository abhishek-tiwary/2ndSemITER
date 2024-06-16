import java.util.Scanner;
public class Q09_MajorDiagonalSum {

    public static double sumMajorDiagonal(double[][] m){
        double sum=0;
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(i==j){
                    sum+=m[i][j];
                }
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rows and columns of your array (rows must be equal to columns)");
        int r= sc.nextInt();
        int c= sc.nextInt();
        double arr[][]= new double[r][c];
        System.out.println("Enter the " + r*c + " elements of your array");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("The sum of the elements of the major diagonal are " + sumMajorDiagonal(arr));
        sc.close();
    }
}
