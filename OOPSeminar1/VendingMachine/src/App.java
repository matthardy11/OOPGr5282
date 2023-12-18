import domen.Product;
import service.CoinDispenser;
import service.Display;
import service.Holder;
import service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Product item1 = new Product("Lays", 0, 100, "snack");
        Product item2 = new Product("Twix", 1, 150, "chocolate");
        Product item3 = new Product("Nuts", 1, 110, "nuts");
        System.out.println(item1);

        List<Product> assort = new ArrayList<>();
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);

        Holder hold1 = new Holder();
        CoinDispenser cd1 = new CoinDispenser();
        Display disp1 = new Display();

        VendingMachine machine = new VendingMachine(hold1, cd1, disp1, assort);

    }
}