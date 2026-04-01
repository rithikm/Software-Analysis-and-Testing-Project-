import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
public class TriangleTest {
    @Test
    public void testTriangle() {
        Triangle triangle = new Triangle(3, 4);
        assertEquals(6.0, triangle.area, 0.001);
        assertEquals("Right Triangle", triangle.type);
        assertEquals("Right Triangle Side 1: 3.0 Side 2: 4.0 Area: 6.0", triangle.toString());
    }
}
