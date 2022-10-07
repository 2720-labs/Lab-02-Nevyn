import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LabTest {
    @Test
    //Testing Add function adding 2 numbers expected result = 15
    public void testAdd() {
        int result = 5 + 10;
        assertEquals(result, 15);
    }

    @Test
    //Testing Subtract function subtracting 2 numbers expected result = 10
    public void testSubtract() {
        int result = 16 - 6;
        assertEquals(result, 10);
    }

    @Test
    //Testing Multiply function Multiplying 2 numbers expected result = 416
    public void testMultiply() {
        int result = 8 * 52;
        assertEquals(result, 416);
    }
}