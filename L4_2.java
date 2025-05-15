import java.util.Scanner;
class L4_2
{
    static boolean isPrime(int n)
    {
        int i, c = 0;
        for(i = 1; i <=n; i++)
        {
            if (n % i == 0)
                c++;
        }
        if (c == 2)
            return true;
        else
            return false;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isPrime(n) == true)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}