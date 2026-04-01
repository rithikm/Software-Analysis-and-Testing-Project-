import java.io.*;
import java.util.*;

/*
 * Written by Rithik Munukala
 */

public class ShapeTreeTester {

    static LinkedBST<Shape> shapes = new LinkedBST<Shape>();
    public static void main(String[] args) {
        System.out.println("Welcome to the shape tree tester!.");
        System.out.println("Reading from file");
        fileReader("shapeFile.txt");
        System.out.println("Printing Preorder");
        shapes.printPreorder();
        System.out.println("Printing Inorder");
        shapes.printInorder();
        System.out.println("Printing Postorder");
        shapes.printPostorder();
        Shape ss = (Shape)shapes.findMaxInTree();
        System.out.println("The max area is: "+ss.getArea());
        Rectangle rt = new Rectangle(2.0, 7.0);
        System.out.println("Deleting Rectangle Side 1: 2.0 Side 2: 7.0 Area: 14.0");
        shapes.remove(rt);
        System.out.println("Printing Inorder");
        shapes.printInorder();
        System.out.println("Deleting values larger than 30");
        shapes.removeLargerThan(30);
        System.out.println("Printing Inorder");
        shapes.printInorder();
    }
    public static void fileReader(String fileName)
    {
        try
        {
            Scanner fileScanner = new Scanner(new File(fileName));
            while(fileScanner.hasNextLine())
            {
                String currLine = fileScanner.nextLine();
                String[] splitLine = currLine.split("\t");
                if(splitLine[0].equals("Rectangle"))
                {
                    System.out.println(currLine);
                    if(splitLine.length == 3)
                    {
                        Rectangle r = new Rectangle(Integer.parseInt(splitLine[1]), Integer.parseInt(splitLine[2]));
                        shapes.add(r);
                    }
                    else
                        System.out.println("Not properly formatted line. Yes you should check for these.  Not intentionally causing a kerfuffle");
                }
                else if(splitLine[0].equals("Circle"))
                {
                    System.out.println(currLine);
                    if(splitLine.length == 2)
                    {
                        Circle c = new Circle(Integer.parseInt(splitLine[1]));
                        shapes.add(c);
                    }
                    else
                        System.out.println("Not properly formatted line. Yes you should check for these.  Not intentionally causing a kerfuffle");

                }
                else if(splitLine[0].equals("Right Triangle"))
                {
                    System.out.println(currLine);
                    if(splitLine.length == 3)
                    {
                        Triangle tr = new Triangle(Integer.parseInt(splitLine[1]), Integer.parseInt(splitLine[2]));
                        shapes.add(tr);
                    }
                    else
                        System.out.println("Not properly formatted line. Yes you should check for these.  Not intentionally causing a kerfuffle");
                }
                else
                    System.out.println("Not properly formatted line. Yes you should check for these.  Not intentionally causing a kerfuffle");

            }
            fileScanner.close();
        }
        catch(Exception e)
        {
            System.out.println("Not properly formatted line. Yes you should check for these.  Not intentionally causing a kerfuffle");
            e.printStackTrace();
        }
    }
}
