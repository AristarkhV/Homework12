import java.util.function.DoubleUnaryOperator;

public class IntegralCalculation {
        public static void main(String[] args) {
            System.out.format("%.2f%n", integrate(x -> 1, 0, 10));
            System.out.format("%.2f%n", integrate(x -> x + 2, 0, 10));
            System.out.format("%.3f%n", integrate(x -> Math.sin(x) / x, 1, 5));
        }

        public static double integrate(DoubleUnaryOperator f, double a, double b) {
            double result = 0;
            double h = 1.0E-6;
            while (a <= b) {
                result += f.applyAsDouble(a) * h;
                a += h;
            }
            return result;
        }
}
