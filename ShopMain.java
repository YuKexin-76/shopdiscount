public class ShopMain {
    public static void main(String[] args) {
        // Initialize products
        Product p1 = new Product(1, "Notebook", 50, 100);
        Product p2 = new Product(2, "Mouse", 100, 50);
        Product p3 = new Product(3, "Keyboard", 150, 30);
        // Create users
        User user1 = new User(1, "Student Li", true);
        User user2 = new User(2, "Normal User Wang", false);
        // Student checkout
        System.out.println("===== Student User Checkout =====");
        Cart cart1 = new Cart();
        cart1.add(p1);
        cart1.add(p2);
        cart1.showItems();
        double origin1 = cart1.getTotal();
        double final1 = Checkout.applyStudentDiscount(origin1, user1.isStudent());
        System.out.println("Original price: " + origin1);
        System.out.println("Price after discount: " + final1);
        // Normal user checkout
        System.out.println("\n===== Normal User Checkout =====");
        Cart cart2 = new Cart();
        cart2.add(p2);
        cart2.add(p3);
        cart2.showItems();
        double origin2 = cart2.getTotal();
        double final2 = Checkout.applyStudentDiscount(origin2, user2.isStudent());
        System.out.println("Original price: " + origin2);
        System.out.println("Price after discount: " + final2);
    }
}
