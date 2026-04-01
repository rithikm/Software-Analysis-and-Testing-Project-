/*
 * Written by Rithik Munukala
 */
public class Shape implements Comparable<Shape>
{
    public double area;
    public String type;

    Shape()
    {
        area = 0;
        type = "";
    }

    public double getArea()
    {
        return area;
    }

    public String getType()
    {
        return type;
    }

    public void print()
    {
        System.out.println(" Area: "+area);
    }
    public int compareTo(Shape aShape)
    {
        if(aShape ==  null)
            return -1;
        if(aShape.getArea()< this.getArea())
            return -1;
        else if(aShape.getArea()>this.getArea())
            return 1;
        else
            return this.type.compareTo(aShape.getType());
    }
    public String toString()
    {
        return this.getType();
    }
}
