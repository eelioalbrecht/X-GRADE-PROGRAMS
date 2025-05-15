import java.util.*;
class L5_6
{
    int num, revnum;
    L5_6()
    {
        num = 0;
        revnum = 0;
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
    }
    int reverse(int y)
    {
        for(int i = num; i > 0; i /= 10)
        {
            int d = i % 10;
            revnum *= 10 + d;
        }
        return revnum;
    }
    void check()
    {
        if (num == reverse(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static void main(String [] args)
    {
        L5_6 obj = new L5_6();
        obj.accept();
        obj.check();
    }
}