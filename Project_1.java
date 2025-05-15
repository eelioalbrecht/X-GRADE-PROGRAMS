class Project_1
{
    double v;
    final double pi = 22/7.0;
    double volume(double R)
    {
        v = (4.0/3) * pi * Math.pow(R, 3);
        return v;
    }
    double volume(double H, double R)
    {
        v = pi * Math.pow(R, 2) * H;
        return v;
    }
    double volume(double L, double B, double H)
    {
        v = L * B * H;
        return v;
    }
    public static void main(String [] args)
    {
        Project_1 obj = new Project_1();
        System.out.println(obj.volume(7.0d));
        System.out.println(obj.volume(13.0d, 7.0d));
        System.out.println(obj.volume(7.0d, 13.0d, 22.0d));
    }
}