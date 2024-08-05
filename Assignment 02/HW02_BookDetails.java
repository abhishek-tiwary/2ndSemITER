import java.util.Scanner;
class Book{
    String BName;
    int BEdition;
    double BPrice;

    Book(String BName, int BEdition, double BPrice){
        this.BName= BName;
        this.BEdition= BEdition;
        this.BPrice= BPrice;
    }

    void display(){
        System.out.println("Book name: " + BName);
        System.out.println("Book Edition: " + BEdition);
        System.out.println("Book Price: " + BPrice);
        System.out.println();
    }
}


public class HW02_BookDetails {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Book b[]= new Book[5];
        for(int i=0; i<5; i++){
            System.out.println("Enter your Book name, Book edition and Book price");
            b[i]= new Book(sc.next(), sc.nextInt(), sc.nextDouble());
        }
        double max=0;
        for(int i=0; i<5; i++){
            if(b[i].BPrice>max){
                max=b[i].BPrice;
            }
        }
        for(int i=0; i<5; i++){
            if(b[i].BPrice== max){
                System.out.println("The details of the costliest book are: ");
                b[i].display();
            }
        }
        sc.close();
    }
}
