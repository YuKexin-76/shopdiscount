import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> list;

    public Cart() {
        list = new ArrayList<>();
    }

    public void add(Product p) {
        list.add(p);
    }

    // Calculate the original total price of the shopping cart
    public double getTotal() {
        double sum = 0;
        for (Product p : list) {
            sum = sum + p.getPrice();
        }
        return sum;
    }

    public void showItems() {
        System.out.println("[Cart]");
        for (Product p : list) {
            System.out.println(p.getName() + " Unit price: " + p.getPrice());
        }
    }
}
