class L5_3
{
    int length,breadth;
    L5_3(int s)
    {
        length=breadth=s;
    }
    L5_3(int l,int b)
    {
        length=l;
        breadth=b;
    }
    void compute()
    {
        int area;
        area = length*breadth;
        System.out.println("Area: " +area);
    }
    public static void main(String args[])
    {
        L5_3 ob1 = new L5_3(7);
        L5_3 ob2 = new L5_3(13, 22);
        ob1.compute();
        ob2.compute();
    }
}