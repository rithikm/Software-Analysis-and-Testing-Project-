import java.util.Random;

public class ShapeTreeFuzzer {

    public static void main(String[] args) {
        LinkedBST<Shape> shapes = new LinkedBST<Shape>();
        Random random = new Random();
        int numShapes = 100;
        for (int i = 0; i < numShapes; i++) {
            Shape shape;
            int type = random.nextInt(3);
            if (type == 0) {
                shape = new Rectangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
            } else if (type == 1) {
                shape = new Circle(random.nextInt(100) + 1);
            } else {
                shape = new Triangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
            }
            shapes.add(shape);
        }
        System.out.println("Printing Preorder");
        shapes.printPreorder();
        System.out.println("Printing Inorder");
        shapes.printInorder();
        System.out.println("Printing Postorder");
        shapes.printPostorder();
        Shape maxShape = shapes.findMaxInTree();
        System.out.println("The max area is: " + maxShape.getArea());
        Rectangle rectToRemove = new Rectangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
        System.out.println("Deleting Rectangle Side 1: " + rectToRemove.side1 + " Side 2: " + rectToRemove.side2);
        shapes.remove(rectToRemove);
        System.out.println("Printing Inorder");
        shapes.printInorder();
        System.out.println("Deleting values larger than 30");
        shapes.removeLargerThan(30);
        System.out.println("Printing Inorder");
        shapes.printInorder();
    }
}
