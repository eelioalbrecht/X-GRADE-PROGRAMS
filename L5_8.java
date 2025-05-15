class L5_8
{
    int a;
    L5_8(int x)
    {
        a = x;
    }
    L5_8()
    {
        a = 0;
    }
    void show()
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {
        L5_8 ob1=new L5_8(7);
        L5_8 ob2=new L5_8(13);
    }
}