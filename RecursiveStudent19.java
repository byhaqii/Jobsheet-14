public class RecursiveStudent19 {
    static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    static int factorialliterative(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        System.out.println(factorialRecursive(5));
        System.out.println(factorialliterative(5));
    }
}