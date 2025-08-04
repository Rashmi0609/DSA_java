public class binomial_coeff {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static int binomialCoefficient(int n, int k) {
        int fact_n = factorial(n);
        int fact_k = factorial(k);
        int fact_n_k = factorial(n - k);
        return fact_n / (fact_k * fact_n_k);
    }
    public static void main(String[] args) {
        System.out.println("Binomial Coefficient C(5, 2) = " + binomialCoefficient(5, 2));
    }
}
