package Homework5_3;

public class Calculator1 {
        public static double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Fehler: Division durch 0 ist nicht möglich");
                return Double.NaN;
            }
            return a / b;
        }
}
