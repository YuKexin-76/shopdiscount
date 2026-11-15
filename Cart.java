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

    // 计算购物车原始总价
    public double getTotal() {
        double sum = 0;
        for (Product p : list) {
            sum = sum + p.getPrice();
        }
        return sum;
    }

    public void showItems() {
        System.out.println("【购物车】");
        for (Product p : list) {
            System.out.println(p.getName() + " 单价：" + p.getPrice());
        }
    }
}
