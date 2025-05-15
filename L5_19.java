import java.util.*;
class L5_19
{
    double x;
    int n;
    L5_19(double x, int n)
    {
        this.x = x;
        this.n = n;
    }
    void sumL5_19_1()
    {
        double s = 0;
        long i, p, j;
        for(i = 1; i <= n; i++)
        {
            p = 1;
            for(j = 1; j <= i; j++)
                p *= j;
            s = s + x / p;
        }
        System.out.println("Sum: " +s);
    }
    void sumL5_19_2()
    {
        double s = 0;
        long i, p, j;
        for(i = 1; i <= n; i++)
        {
            p = 1;
            for(j = 1; j <= i + 1; j++)
            {
                p *= j;
            }
            s = s + x * i / p;
        }
        System.out.println("Sum: " +s);
    }
    void sumL5_19_3()
    {
        double s = 0;
        long i, p, j;
        for(i = 1; i <= n; i++)
        {
            p=1;
            for(j = 1; j <= i + 1; j++)
            {
                p *= j;
            }
            if (i % 2 != 0)
                s = s + x * i / p;
            else
                s = s - x * i / p;
        }
        System.out.println("Sum: " +s);
    }
    public static void main(String [] args)
    {
        L5_19 obj = new L5_19(7.13d, 22);
        obj.sumL5_19_1();
        obj.sumL5_19_2();
        obj.sumL5_19_3();
    }
}