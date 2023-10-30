package org.example.fibonacci;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {

    @Test
    void shouldReturnFibonacciCalculation() {
        int fibonacci = Fibonacci.fibonacci(4);

        assertThat(fibonacci).isEqualTo(3);
    }
}