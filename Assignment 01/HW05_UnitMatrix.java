public class HW05_UnitMatrix {
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        System.out.println("Matrix is ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 2);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int maxRow = 0, temp = 0, maxColumn = 0, temp1 = 0;
        for (int i = 0; i < a.length; i++) {
            int rowCount = 0, columnCount = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    rowCount++;
                }if(rowCount>temp){
                    temp=rowCount;
                    maxRow=i;
                }if(a[j][i]==1){
                    columnCount++;
                }if(columnCount>temp1){
                    temp1=columnCount;
                    maxColumn=i;
                }
            }
        }
        System.out.println("the largest row index : "+maxRow);
        System.out.println("the lagest column index : "+maxColumn);
    }
}
