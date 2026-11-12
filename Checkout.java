public class Checkout {
    public static double applyStudentDiscount(double total, boolean isStudent) {
        if (isStudent) {
            return total * 0.90;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(applyStudentDiscount(100, true));
        System.out.println(applyStudentDiscount(100, false));
    }
}
