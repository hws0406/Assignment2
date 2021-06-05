import java.util.Scanner;

public class InventoryManagement extends ClothingRentalService{

    static Scanner in = new Scanner(System.in);

    int nTotal, nRented;
    protected int nAvailable;
    String date;

    public InventoryManagement(int nT, int nR) {
        nTotal= nT;
        nRented = nR;

        System.out.println("\n---------Inventory Management--------");
        System.out.print("\nEnter date: ");
        date = in.nextLine();
        
        printInfo();
    }

    public int calcQuantityAvailable() {
        return nAvailable = nTotal - nRented;
    }

    public void InventoryStock() {
        System.out.println("\nInventory Stock for: " + date +
                "\n--------------------------------------------" +
                "\nTotal quantity available: " + nTotal +
                "\nTotal rented: " + nRented +
                "\nTotal available: " + calcQuantityAvailable());
    }

    public void printInfo(){
        InventoryStock();
    }
}
