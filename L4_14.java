class L4_14
{
    static boolean prime(int n)
    {
        int i, c = 0;
        for(i = 1; i <= n; i++)
        {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            return true;
        else
            return false;
    }
    static int sum(int n)
    {
        int i, d, s = 0;
        for(i = n; i > 0; i /= 10)
        {
            d = i % 10;
            s += d;
        }
        return s;
    }
    static void call()
    {
        int i, s;
        for(i = 100; i <= 999; i++)
        {
            s = sum(i);
            if (prime(s) == true)
                System.out.println("Prime number: " +i);
        }
    }
}