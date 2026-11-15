public class ShopMain {
    public static void main(String[] args) {
        // 初始化商品
        Product p1 = new Product(1, "笔记本", 50, 100);
        Product p2 = new Product(2, "鼠标", 100, 50);
        Product p3 = new Product(3, "键盘", 150, 30);
        // 创建用户
        User user1 = new User(1, "学生小李", true);
        User user2 = new User(2, "普通用户小王", false);
        //学生下单
        System.out.println("=====学生用户结算=====");
        Cart cart1 = new Cart();
        cart1.add(p1);
        cart1.add(p2);
        cart1.showItems();
        double origin1 = cart1.getTotal();
        double final1 = Checkout.applyStudentDiscount(origin1, user1.isStudent());
        System.out.println("原价：" + origin1);
        System.out.println("折扣后价格：" + final1);
        //普通用户下单
        System.out.println("\n=====普通用户结算=====");
        Cart cart2 = new Cart();
        cart2.add(p2);
        cart2.add(p3);
        cart2.showItems();
        double origin2 = cart2.getTotal();
        double final2 = Checkout.applyStudentDiscount(origin2, user2.isStudent());
        System.out.println("原价：" + origin2);
        System.out.println("折扣后价格：" + final2);
    }
}
