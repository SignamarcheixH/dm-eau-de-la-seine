package dm2;

/**
 * Ne touchez pas à cette classe. Vous devez implémentez les tests unitaires de cette classe dans `MathUtilsTest`
 */
public class MathUtils {

    int power(int number, int pow) {
        int j = 1;
        for (int i = 0; i < pow; i++) {
            j = j * number;
        }

        return j;
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("`n` must be greater or equals zero");
        }

        int c = n;
        while (c != 1) {
            n *= --c;
        }

        return n;
    }

    int fibonacci(int n) {
        if (n < 0) {
            throw new UnsupportedOperationException("n must be greater or equals zero, current function does NOT support Negafibonacci");
        } else if (n <= 1) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
