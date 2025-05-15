class L5_4
{
    int n, s = 0;
    L5_4(int t)
    {
        n = t;
    }
    void compute()
    {
        int i;
        for(i = 1; i <= n; i++)
        {
            s += i;
        }
    }
    void display()
    {
        System.out.println("Sum: "+s);
    }
    public static void main(String [] args)
    {
        L5_4 obj = new L5_4(7);
        obj.compute();
        obj.display();
    }
}