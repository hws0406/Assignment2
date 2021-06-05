import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nWelcome to HWS Clothing Rental!");
        System.out.println("-----------------------------------");

        ClothingRentalService crs = new ClothingRentalService("HWS Clothing Rental");
        crs.printDescription();

        System.out.println("\n\n----------------------------------------");
        System.out.println("Login");
        System.out.println("\n1 == Customer");
        System.out.println("\n2 == Admin");
        System.out.println("\n3 ==  Exit to Main Menu");

        System.out.println("\nEnter 1 or 2 to login, 3 to Exit");
        System.out.print("Code: ");
        String menuOption = in.nextLine();
        System.out.print("\n------------------------------------------");

        switch(menuOption) {
            case "1":
                System.out.println("\n\nHi Dear Customer, \nGlad to have this wonderful chance to serve you. Thanks for choosing us! ");
                System.out.println("\nPlease log in:" +
                        "\nPress 1 for returned customer" +
                        "\nPress 2 for new customer");
                System.out.print("Code: ");
                int cusOption = in.nextInt();
                System.out.println("\n----------------------------------------");

                if(cusOption == 1) {
                    System.out.println("\nHi Customer! Welcome back.");
                    System.out.print("\nUsername: ");
                    String cusUsername = in.next();
                    System.out.print("Password: ");
                    String cusPassword = in.next();

                    if((cusUsername.equals("Sherry")) && (cusPassword.equals("sherry@1314"))){
                        String cusName = "Sherry";
                        System.out.println("\nLogin Successfully. Welcome Back " + cusName + "!");
                        System.out.println("Lets Start with choosing your prefer clothing");
                        Sales s = new Sales();
                        System.out.println(s);
                        s.receipt();
                    }

                    else {
                        System.out.println("Wrong Login Credential. Please try again!");
                        System.exit(0);
                    }
                }
                if(cusOption == 2) {
                    CustomerRegistration cr = new CustomerRegistration();
                    System.out.println(cr);
                    cr.registerAcc();
                    cr.printInfo();
                }break;


            case "2":
                System.out.println("Hi Admin! Please log in to access system info");
                System.out.println("Username:" );
                String username = in.next();
                System.out.println("Password:" );
                String password = in.next();

                if((username.equals("hws")) && (password.equals("hws@0406"))) {
                    System.out.println("\nAdmin" + username + "Log In Successful!");
                    System.out.print("\n------------------------------------------");

                    String admName = "hws";
                    String position = "Admin";
                    System.out.println("\nAdmin online: " + admName + position);

                    boolean admin = true;
                    while(admin) {
                        System.out.println("Choose one option to continue\n1. Advertisement and Marketing\n2. Inventory Management\n3. Employee Management\n4. Finance");
                        int choice = in.nextInt();

                        if(choice == 1) {
                            AdvertisementandMarketing am = new AdvertisementandMarketing("Gowns","Hoodie");
                            System.out.println(am);
                        }

                        if(choice == 2) {
                            InventoryManagement im = new InventoryManagement(20,5);
                            System.out.println(im);
                        }

                        if(choice == 3) {
                            EmployeeManagement em = new EmployeeManagement();
                            System.out.println(em);
                        }

                        if(choice == 4) {
                            Finance f = new Finance(6000,3500);
                            System.out.println(f);
                        }

                        if(choice > 5) {
                            System.out.println("\nWrong input! Please try again.");
                            System.exit(0);
                        }
                        else {
                            System.out.println("\nIncorrect username and password. Please Try again.");
                        }
                    }
                }

                else {
                    System.out.println("Invalid input. Please enter again.");
                    System.exit(0);
                }
                break;

            case "3":
                System.out.println("\nThanks for visiting. Return back to Main Menu now");
                System.exit(0);
        }
    }
}
