class L5_7
{
    int a, b, c;
    L5_7(int x, int y)
    {
        a = x;
        b = y;
    }
    void show()
    {
        System.out.println(a + " " + b + " " + c);
    }
    void compute()
    {
        c = a + b;
    }
    public static void main(String [] args)
    {
        L5_7 obj = new L5_7(7, 13);
        obj.compute();
        obj.show();
    }
}
