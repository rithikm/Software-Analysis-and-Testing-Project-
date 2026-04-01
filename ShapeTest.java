import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
public class ShapeTest {
    @Test
    public void testShape() {
        Shape shape = new Shape();
        assertEquals(0.0, shape.area, 0.001);
        assertEquals("", shape.type);
        assertEquals("", shape.toString());
    }

    @Test
    public void testShapeWithValues() {
        Shape shape = new Shape();
        shape.area = 48.0;
        shape.type = "Rectangle";
        assertEquals(48.0, shape.area, 0.001);
        assertEquals("Rectangle", shape.type);
        assertEquals("Rectangle", shape.toString());
    }
}
