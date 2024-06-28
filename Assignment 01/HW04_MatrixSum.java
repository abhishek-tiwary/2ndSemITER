import java.util.Scanner;
public class HW04_MatrixSum {
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] c=new double[a.length][a.length];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int row=sc.nextInt();
        System.out.println("Enter number of columns ");
        int column=sc.nextInt();
        double[][] a=new double[row][column];
        double[][] b=new double[row][column];
        System.out.println("Enter elements of a ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of b ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                b[i][j]=sc.nextInt();
            }
        }
        double SumMatrix[][] = addMatrix(a,b);
        System.out.println("Sum of the matrix a and b are ");
        for(int i=0;i<SumMatrix.length;i++){
            for(int j=0;j<SumMatrix.length;j++){
                System.out.print(SumMatrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}