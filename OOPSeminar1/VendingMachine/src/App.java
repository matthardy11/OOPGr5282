import domen.Bottle;
import domen.HotDrink;
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
        Product item3 = new Product("Nuts", 2, 110, "nuts");
        Product item4 = new Bottle("Cola", 3, 90, "drink", 0.5);
        Product item5 = new HotDrink("Coffee", 4, 50, "hot drink", 60.0);
        Product item6 = new HotDrink("Tea", 5, 30, "hot drink", 70.0);

        List<Product> assort = new ArrayList<>();
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);

        Holder hold1 = new Holder();
        CoinDispenser cd1 = new CoinDispenser();
        Display disp1 = new Display();

        VendingMachine machine = new VendingMachine(hold1, cd1, disp1, assort);

        for (Product prod: machine.getProducts()){
            System.out.println(prod);
        }
    }
}