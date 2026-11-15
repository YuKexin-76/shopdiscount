public class Checkout {
    // 学生折扣：10%优惠
    public static double applyStudentDiscount(double total, boolean isStudent) {
        if (isStudent) {
            return total * 0.90;
        }
        return total;
    }
}
