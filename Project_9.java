class Project_9//Area
{
    double pg, rh, tr, z = 1/2.0;
    double area(int b, int h)
    {
        pg = b * h;
        return pg;
    }
    double area(double d1, double d2)
    {
        rh = z * d1 * d2;
        return rh;
    }
    double area(double a, double b, double h)
    {
        tr = z * (a + b) * h;
        return tr;
    }
    public static void main(String [] args)
    {
        Project_9/*Area*/ obj = new Project_9/*Area*/();
        System.out.println("Area of Parallelogram: " +obj.area(7, 13));
        System.out.println("Area of Rhombus: " +obj.area(13.0d, 7.0d));
        System.out.println("Area of Trapezium: " +obj.area(7.0d, 13.0d, 22.0d));
    }
}