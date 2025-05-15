class L5_1
{
    static int length,breadth,height;
    L5_1(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    static void compute()
    {
    int vol;
    vol = length * breadth * height;
        System.out.println("Volume: " +vol);
    }
    public static void main(String [] args)
    {
        compute();
    }
}