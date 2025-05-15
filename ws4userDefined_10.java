import java.util.*;
class ws4userDefined_10
{
    static int h, t, o;
    static double number;
    static void assign()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit at the 'hundreds place': ");
        h = sc.nextInt();
        System.out.println("Enter the digit at the 'tens place': ");
        t = sc.nextInt();
        System.out.println("Enter the digit at the 'ones place': ");
        o = sc.nextInt();
    }
    static void findnumber()
    {
        number = (h * 100) + (t * 10) + o;
    }
    public static void main(String [] args)
    {
        assign();
        findnumber();
        System.out.println("The number: " +number);
    }
}