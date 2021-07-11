public class Test {
    public static void main(String[] args) {
        counter(5);
        System.out.println(factorial(5));
    }

    private static void counter(int n) {
        if (n <= 0) {       // this is condition to stop recursion and prevent stackoverflow.
            System.out.println("0");
            return ;
        }
        System.out.println(n);
        counter(n - 1);  // this is recursion, method calls itself.
    }

    private static int factorial(int n) {
        if (n <= 1)
            return 1;
        return n * factorial(n - 1);
    }
}
