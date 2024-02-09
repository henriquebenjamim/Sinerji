import Entities.Customer;
import Entities.Role;
import Entities.Seller;


public class Main {
    public static void main(String[] args) {
        Seller sl = new Seller("Seller", 7000.0f, 20.0f, 1800.0f);
        Customer hb = new Customer("Henrique", sl, "01/2018");
        System.out.println(hb.toString());

        //Role roleToCreate = new Role("Seller", 12000.0f, 20.0f, 1800.0f);

    }
}