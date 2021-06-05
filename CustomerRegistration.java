import java.util.Scanner;

public class CustomerRegistration extends ClothingRentalService{

    String name, gender, birthDate, address, phoneNo, username, password;
    Scanner in = new Scanner(System.in);

    CustomerRegistration() {
        super();

        System.out.println("\n-------------------------------------------------");
        System.out.println("\nWelcome to Customer Registration Portal");
        System.out.println("Please enter your details: ");

        System.out.print("\nName: ");
        name = in.nextLine();
        System.out.print("Gender: ");
        gender = in.nextLine();
        System.out.print("Date of Birth: ");
        birthDate = in.nextLine();
        System.out.print("Address: ");
        address = in.nextLine();
        System.out.print("Contact: ");
        phoneNo = in.nextLine();
        printInfo();
    }

    public void registerAcc() {
        System.out.print("\nUsername : ");
        username = in.nextLine();
        System.out.print("Password : ");
        password = in.nextLine();
    }

    public void printDetails() {
        System.out.println("\n----------------------------------------------------------");
        System.out.println("Account Details: ");
        System.out.println("\nName: " + this.name);
        System.out.println("\nGender: " + this.gender);
        System.out.println("\nBirth Date: " + this.birthDate);
        System.out.println("\nAddress: " + this.address);
        System.out.println("\nPhone Number: " + this.phoneNo);
        System.out.println("\nUsername: " + this.username);
        System.out.println("\nPassword: " + this.password);
        System.out.println("\n----------------------------------------------------------");
        System.out.println("\nAccount Registered Successfully");
    }

    public void printInfo(){
        registerAcc();
        printDetails();
    }
}
