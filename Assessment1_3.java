import java.util.*;
class Assessment1_3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int d, s = 0, n, i;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for(i=n;i>0;i/=10)
        {
            d=i%10;
            s+=d;
        }
        if(n%s==0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}