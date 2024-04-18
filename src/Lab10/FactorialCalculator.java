package src.Lab10;

public class FactorialCalculator {
    public long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}