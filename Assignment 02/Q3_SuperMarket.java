import java.util.Scanner;

class Product{
    String prodId;
    double price;
    int quantity;
    static double totalPrice;

    Product(String prodId, int quantity, double price){
        this.prodId= prodId;
        this.price= price;
        this.quantity= quantity;
        totalPrice+=price*quantity;
    }

    void display(){
        System.out.println("Product ID: " + prodId + "\t" + "Quantity: " + quantity + "\t" + "Price: " + price );
        System.out.println();
    }
}
public class Q3_SuperMarket {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Product p[]= new Product [5];
        for(int i=0; i<5; i++){
            System.out.println("Enter the product ID, Quantity and Price of your Product");
            p[i] = new Product(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        for(int i=0; i<5; i++){
            p[i].display();
        }
        System.out.println("Total price: " + Product.totalPrice);
        sc.close();
    }
}
