/*
 * Written by Rithik Munukala
 */
public class Circle extends Shape
{
    private double radius;

    public Circle(double r)
    {
        radius = r;
        super.area = radius*radius*Math.PI;
        super.type = "Circle";
    }
    public void print()
    {
        System.out.println("Circle Radius: "+ radius);

        super.print();
    }
    public String toString()
    {
        return	super.toString() +" Radius: "+ radius +" Area: "+area;
    }
}
