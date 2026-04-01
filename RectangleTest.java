import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
public class RectangleTest {
    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(6, 8);
        assertEquals(48.0, rectangle.area, 0.001);
        assertEquals("Rectangle", rectangle.type);
        assertEquals("Rectangle Side 1: 6.0 Side 2: 8.0 Area: 48.0", rectangle.toString());
    }
}
