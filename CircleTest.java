import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
public class CircleTest {
    @Test
    public void testCircle() {
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483, circle.area, 0.001);
        assertEquals("Circle", circle.type);
        assertEquals("Circle Radius: 5.0 Area: 78.53981633974483", circle.toString());
    }
}
