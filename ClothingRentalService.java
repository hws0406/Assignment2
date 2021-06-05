
public abstract class ClothingRentalService {

    private String name, address, contact, email;

    public ClothingRentalService() {
        this.name = name;
        this.address = "8-G, Pusat Perdagangan Pontian, 82000 Pontian Johor";
        this.contact = "07-68704060";
        this.email = "hws4600@hotmail.com";
        printInfo();
    }

    public void printDescription() {
        System.out.println("\n----------About Us---------");
        System.out.println("Company Name: " + this.name);
        System.out.println("\nCompany Address: " + this.address);
        System.out.println("\nNo H/P: " + this.contact);
        System.out.println("\nEmail: " + this.email);
    }

    public void printInfo(){
        printDescription();
    };
}
