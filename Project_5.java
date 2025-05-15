import java.util.*;
class Project_5
{
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
    boolean isArmstrong(int n)
    {
        int i, s = 0, d;
        for(i = n; i > 0; i /= 10)
        {
            d = i % 10;
            s += d *d * d;
        }
        if(s == n)
            return true;
        else
            return false;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int N = sc.nextInt();
        Project_5 ob = new Project_5();
        System.out.println("Prime: " +ob.isPrime(N));
        System.out.println("Armstrong: " +ob.isArmstrong(N));
    }
    public static void main(String [] args)
    {
        Project_5 obj = new Project_5();
        obj.input();        
    }
}