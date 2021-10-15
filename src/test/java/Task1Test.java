import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    private final Task1 underTest = new Task1();

    @Test
    public void shouldReturnOne() {
        int compute = underTest.compute(1);

        assertEquals(compute, 1);
    }
    @Test
    public void shouldReturnSecondValue(){
        int compute = underTest.compute(2);

        assertEquals(compute, 1);
    }

    @Test
    public void shouldReturnThirdValue(){
        int compute = underTest.compute(3);

        assertEquals(compute, 2);
    }
    @Test
    public void shouldReturnFourthValue(){
        int compute = underTest.compute(4);

        assertEquals(compute, 3);
    }
}