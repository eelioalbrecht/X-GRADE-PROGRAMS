import java.util.*;
class L5_18
{
    int n;
    L5_18(int a)
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
    void sumOfL5_18(int n)
    {
        int i = n, d, s = 0;
        while(i > 0)
        {
            d = i % 10;
            if (isPrime(d) == true)
                s += d;
            i /= 10;
        }
        System.out.println("Sum of prime digits: " +s);
    }
}