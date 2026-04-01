import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
public class PairwiseCaseCoverageTests {
    LinkedBST<Shape> shapes = new LinkedBST<Shape>();

    @Test
    public void testCircle() {
        Circle c0 = new Circle(0);
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(3);
        Circle c4 = new Circle(4);

        assertEquals(0, c0.getArea(), 0.001);
        assertEquals(Math.PI, c1.getArea(), 0.001);
        assertEquals(4 * Math.PI, c2.getArea(), 0.001);
        assertEquals(9 * Math.PI, c3.getArea(), 0.001);
        assertEquals(16 * Math.PI, c4.getArea(), 0.001);
    }

    @Test
    void testRectangle() {
        Rectangle r00 = new Rectangle(0, 0);
        Rectangle r01 = new Rectangle(0, 1);
        Rectangle r10 = new Rectangle(1, 0);
        Rectangle r11 = new Rectangle(1, 1);
        Rectangle r23 = new Rectangle(2, 3);

        assertEquals(0, r00.getArea(), 0.001);
        assertEquals(1, r01.getArea(), 1.0);
        assertEquals(0, r10.getArea(), 0.001);
        assertEquals(1, r11.getArea(), 0.001);
        assertEquals(6, r23.getArea(), 0.001);
    }


    @Test
    public void testTriangle() {
        Triangle t00 = new Triangle(0, 0);
        Triangle t01 = new Triangle(0, 1);
        Triangle t10 = new Triangle(1, 0);
        Triangle t11 = new Triangle(1, 1);
        Triangle t23 = new Triangle(2, 3);

        assertEquals(0, t00.getArea(), 0.001);
        assertEquals(0.0, t01.getArea(), 0.001);
        assertEquals(0.0, t10.getArea(), 0.001);
        assertEquals(0.5, t11.getArea(), 0.001);
        assertEquals(3, t23.getArea(), 0.001);
    }

}
