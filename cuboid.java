class cuboid
{
    int l, b, h;
    cuboid(int L, int B, int H)//constructor
    {
        l = L;
        b = B;
        h = H;
    }
    void vol()
    {
        double VC = l * b * h;
        System.out.println(VC);
    }
    public static void main(String [] args)
    {
        cuboid obj = new cuboid(7, 13, 22);
        obj.vol();
    }
}