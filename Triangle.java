public class Triangle extends Shape
{
    private double side1;
    private double side2;

    public Triangle(double s1, double s2)
    {
        side1 = s1;
        side2 = s2;
        super.area = 0.5*side1*side2;
        super.type = "Right Triangle";
    }
    public void print()
    {
        System.out.println("Right Triangle Side 1: "+side1+" Side 2: "+side2);

        super.print();
    }
    public String toString()
    {
        return	super.toString()+" Side 1: "+side1+" Side 2: "+side2+ " Area: "+area;
    }
}
