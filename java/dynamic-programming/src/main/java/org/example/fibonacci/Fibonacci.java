package org.example.fibonacci;

public class Fibonacci {

    private Fibonacci() {
        throw new IllegalStateException("Fibonacci");
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
