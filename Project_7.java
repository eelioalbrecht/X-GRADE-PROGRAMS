import java.util.*;
class Project_7
{
    static boolean digits(int n)
    {
        int i, c = 0;
        for(i = n; i > 0; i /= 10)
        {
            c++;
        }
        if(n == (n * n) % (int) Math.pow(10, c))
            return true;
        else
            return false;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int n = sc.nextInt();
        System.out.println("Automorphic: " +digits(n));
    }
}