import java.util.Scanner;
import java.text.DecimalFormat;

public class Sales extends ClothingRentalService implements Payment {

    static Scanner in = new Scanner(System.in);
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    String name;
    String date;
    String style;
    int days, quantity;
    double price;
    double pricePerDay;
    double payment;
    double balance;


    public Sales() {
        System.out.print("\nEnter your name: ");
        name = in.nextLine();

        System.out.print("\nEnter date: ");
        date = in.nextLine();

        System.out.print("\nKinds of clothing available: Dress, Jumpsuit, Jacket, Playsuit, Sets & Suits: ");
        style = in.nextLine();

        System.out.print("\nEnter rental days: ");
        days = in.nextInt();

        System.out.print("\nEnter quantities: ");
        quantity = in.nextInt();

        System.out.print("\nEnter price: ");
        pricePerDay = in.nextDouble();

        if (quantity <= 10){
            System.out.println("\nThe price per day is: "+ pricePerDay);
            System.out.println("\nThe total price is: " + df2.format(calculateTotalPrice()) + " for " + days + "days");
        }

        else if (quantity >10) {
            System.out.println("\nThe price per day is: "+ pricePerDay);
            System.out.println("\nThe total price is: " + df2.format(calculateTotalPrice()) + " for " + days + "days");
        }

        else {
            System.out.println("Invalid. Please reenter.");
        }

        System.out.print("\nEnter payment: RM");
        payment = in.nextDouble();
        
        printInfo();
    }

    public double calculateTotalPrice() {
        return price = pricePerDay * quantity * days;
    }

    public double calcBalance() {
        return balance = payment - price;
    }

    public void receipt() {
        System.out.print( "\nReceipt" +
                "\n-----------------------------------------------------" +
                "\nName: " + name +
                "\nDate: " + date +
                "\nStyle: " + style +
                "\nQuantity: " + quantity +
                "\nPrice /day: " + pricePerDay +
                "\nTotal Days: " + days + "days" +
                "\nTotal Price: RM" + price +
                "\nTotal Payment: RM " + payment +
                "\nBalance: RM " + df2.format(calcBalance()) +
                "\n------------------------------------------------------------" +
                "\n--------Thank You for Purchasing from Us--------");
    }
    
    public double getPayment() {
        return 0;
    }
    
    public void printInfo() {
        calculateTotalPrice();
        calcBalance();
        receipt();
    }
}
