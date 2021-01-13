import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    private final Task1 underTest = new Task1();

    @Test
    public void shouldReturnOne() {
        int compute = underTest.computeFibonacci(1);

        assertEquals(compute, 1);
    }

    @Test
    public void shouldReturnOneForSecondNumber() {
        int compute = underTest.computeFibonacci(2);

        assertEquals(compute, 1);
    }


    @Test
    public void shouldReturn3() {
        int compute = underTest.computeFibonacci(4);

        assertEquals(compute, 3);
    }
}

// 1 1 2 3