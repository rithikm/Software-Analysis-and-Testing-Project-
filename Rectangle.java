/*
 * Written by Rithik Munukala
 */
public class Rectangle extends Shape
{
    double side1;
    double side2;

    public Rectangle(double s1, double s2)
    {
        super();
        side1 = s1;
        side2 = s2;
        super.area = side1*side2;
        super.type = "Rectangle";
    }
    public void print()
    {
        System.out.println("Rectangle Side 1: "+side1+" Side 2: "+side2);

        super.print();
    }
    public String toString()
    {
        return	super.toString()+" Side 1: "+side1+" Side 2: "+side2+ " Area: "+area;
    }

}