import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LabTest {
    @Test
    public void testAdd() {
        int result = 5 + 10;
        assertEquals(result, 15);
    }

    @Test
    public void testSubtract() {
        int result = 16 - 6;
        assertEquals(result, 10);
    }

    @Test
    public void testMultiply() {
        int result = 8 * 52;
        assertEquals(result, 416);
    }
}