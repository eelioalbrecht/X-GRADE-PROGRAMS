class area
{
    int r;
    area()
    {
        r = 7;
    }
    void calc()//calc fcn
    {
        double AC = (22.0 / 7) * Math.pow(r, 2);
        System.out.println(AC);
    }
    public static void main(String [] args)
    {
        area obj = new area();
        obj.calc();
    }
}