package Homework5_3;

public class Calculator2 {
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division durch 0 ist nicht erlaubt.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(Calculator2.divide(3, 0));
        } catch (ArithmeticException e) {
            System.out.println("Fehler : " + e.getMessage());
        }
    }
}
