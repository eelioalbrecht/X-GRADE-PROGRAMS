import java.util.*;
class L5_17
{
    int n;
    L5_17(int a)
    {
        n = a;
    }
    boolean isPrime(int n)
    {
        int i, c = 0;
        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
                c++;
        }
        if(c == 2)
            return true;
        else
            return false;
    }
    void display()
    {
        int i = 0, p = 2;
        while(i<n)
        {
            if(isPrime(p) == true)
            {
                System.out.println(p);
                i++;
            }
            p++;
        }
    }
    public static void main(String [] args)
    {
        L5_17 obj = new L5_17(7);
        obj.isPrime(5);
        obj.display();
    }
}