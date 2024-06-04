import java.util.Scanner;
public class Q07_MinMaxArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of your array");
        int a=sc.nextInt();
        int arr[]= new int[5];
        System.out.println("Enter the " + a + " elements of your array");
        for(int i=0; i<5; i++){
            arr[i]= sc.nextInt();
        }
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for(int i=0; i<5; i++){
            if(arr [i] > max){
                max= arr[i];
            }
        }
        for(int i=0; i<5; i++){
            if(arr [i] < min){
                min= arr[i];
            }
        }
        System.out.println("The max value is " + max + " and the min value is " + min);

        int count1=0;
        int count2=0;
        int first= -1;
        int last= 0;

        for(int i=0; i<5; i++){
            if (arr[i]== max){
                count1++;
                if(first==-1){
                    first=i+1;
                }
            }
            if (arr[i]==min){
                count2++;
                last=i+1;
            }
        }
        System.out.println("The number of times max occurs is " + count1 + " and min occurs is " + count2);
        System.out.println("The first occurence of max value is at position " + first + " and the last occurence of the min value is at position " + last);
        
        sc.close();
    }
}
