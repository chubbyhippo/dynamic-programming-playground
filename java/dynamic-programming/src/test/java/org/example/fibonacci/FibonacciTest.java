package org.example.fibonacci;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void shouldReturnFibonacciCalculation() {
        int fibonacci = Fibonacci.fibonacci(4);

        Assertions.assertThat(fibonacci).isEqualTo(3);
    }
}