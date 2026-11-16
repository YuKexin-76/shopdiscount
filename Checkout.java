public class Checkout {
    // Student discount: 10% off
    public static double applyStudentDiscount(double total, boolean isStudent) {
        if (isStudent) {
            return total * 0.90;
        }
        return total;
    }
}
