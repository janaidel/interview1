import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    private final Task1 underTest = new Task1();

    @Test
    public void shouldReturnOne() {
        int compute = underTest.compute(1);

        assertEquals(compute, 1);
    }
}