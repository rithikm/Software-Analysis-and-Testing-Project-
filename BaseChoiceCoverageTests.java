import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class BaseChoiceCoverageTests {
    //TR1: Testing the Comparable Interface
    @Test
    public void testComparableInterface() {
        Shape s1 = new Rectangle(2, 3);
        Shape s2 = new Circle(4);
        Shape s3 = new Triangle(5, 6);
        assertFalse(s1.compareTo(s2) < 0);
        assertTrue(s2.compareTo(s3) < 0);
        assertFalse(s1.compareTo(s3) < 0);
        assertEquals(0, s2.compareTo(s2));
    }

    //TR2: Testing the Remove Function
    @Test
    public void testRemoveFunction()  {
        LinkedBST<Shape> shapes = new LinkedBST<Shape>();
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Circle(4));
        shapes.add(new Triangle(5, 6));
        assertFalse(shapes.remove(new Rectangle(2, 3)));
        assertFalse(shapes.remove(new Circle(4)));
        assertFalse(shapes.remove(new Triangle(5, 6)));
        assertFalse(shapes.remove(new Rectangle(2, 3)));
        assertEquals(0, shapes.size());
    }


    //TR3: Testing the Add Function
    @Test
    public void testAddFunction() {
        LinkedBST<Shape> shapes = new LinkedBST<Shape>();
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Circle(4));
        shapes.add(new Triangle(5, 6));
        assertEquals(0, shapes.size());
        shapes.add(new Rectangle(2, 3));
        assertEquals(0, shapes.size());
    }

    //TR4: Testing Remove Function
    @Test
    public void testRemoveLargerThanFunction() {
        LinkedBST<Shape> shapes = new LinkedBST<Shape>();
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Circle(4));
        shapes.add(new Triangle(5, 6));
        shapes.removeLargerThan(10);
        assertEquals(0, shapes.size());
        shapes.removeLargerThan(5);
        assertEquals(0, shapes.size());
        shapes.removeLargerThan(0);
        assertEquals(0, shapes.size());
    }


    //TR5: Testing the Search Function
    @Test
    public void testSearchFunction() {
        LinkedBST<Shape> shapes = new LinkedBST<Shape>();
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Circle(4));
        shapes.add(new Triangle(5, 6));
        assertTrue(shapes.search(new Rectangle(2, 3)));
        assertFalse(shapes.search(new Circle(4)));
        assertFalse(shapes.search(new Triangle(5, 6)));
        assertFalse(shapes.search(new Rectangle(4, 3)));
    }

}
