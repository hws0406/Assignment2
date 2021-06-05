
import java.util.Scanner;

public class EmployeeManagement extends ClothingRentalService{

    Scanner in = new Scanner(System.in);

    String[] name = new String[20];
    String[] position = new String[20];
    double[] salary = new double[20];
    String[] tel = new String[20];
    int n;


    public EmployeeManagement() {
        super();
        name[n] = "Ho";
        position[n] = "Manager";
        salary[n] = 8000;
        tel[n] = "0185487515";

        name[n] = "Shasha";
        position[n] = "Promoter";
        salary[n] = 3500;
        tel[n] = "0187451245";

        name[n] = "Syazwan";
        position[n] = "Promoter";
        salary[n] = 3500;
        tel[n] = "0187964586";
    }

    public void printInfo() {
        super.printInfo();
    }
}
