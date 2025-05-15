class L4_22
{
    boolean isPrime(int n)
    {
        int c = 0;
        boolean b;
        for(int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                c += 1;
        }
        if (c == 2)
            b = true;
        else
            b = false;
        return b;
    }
    //int sumOfPrimeDigits(){}
    
    public static void main(String [] args)
    {
        L4_22 obj = new L4_22();
        System.out.println(obj.isPrime(2));
    }
}