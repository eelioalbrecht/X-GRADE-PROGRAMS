import java.util.*;
class Project_2
{
    static void isComposite(int n)
    {
        int i, c = 0;
        for(i = 1; i <= n; i++)
        {
        if(n % i == 0)
            c++;
        }
        if(c > 2)
            System.out.println("Composite number");
        else
            System.out.println("Not a Composite number");
    }
    static void smallest(int n)
    {
        int i, d, min = 0;
        for(i = n; i > 0; i /= 10)
        {
            d = i % 10;
            if(min == 0)
            min = d;
            if(d < min)
            min = d;
        }
        System.out.println("Smallest digit: "+min);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, n, r, ch, d;
        System.out.println("---MENU---");
        System.out.println("1. Composite Number");
        System.out.println("2. Smallest digit in a number");
        System.out.println("Enter your choice: ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            isComposite(n);
            break;
            case 2:
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            smallest(n);
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
}