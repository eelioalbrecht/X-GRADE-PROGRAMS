import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        char ch = 'y';
        while (ch == 'y')
        {
            System.out.println("Enter which operation do u want to do:"
                + "\n1 for Addition"
                + "\n2 for Subtraction"
                + "\n3 for Multiplication"
                + "\n4 for Division"
                + "\n5 for Modulus"
                + "\n6 for Square"
                + "\n7 for Cube"
                + "\n8 for Power"
                + "\n9 for Cube Root"
                + "\n10 for Square Root");
            int Opt = sc.nextInt();
            if (Opt == 1 || Opt == 2 || Opt == 3 || Opt == 4 || Opt == 5 || Opt == 8)
            {
                System.out.println("Enter two numbers:");
                a = sc.nextInt();
                b = sc.nextInt();
            }
            else if (Opt == 6 || Opt == 7 || Opt == 9 || Opt == 10)
            {
                System.out.println("Enter a number:");
                a = sc.nextInt();
            }
            else
            {
                System.out.println("Invalid Operator");
                continue;
            }
            switch(Opt) 
            {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println(a / b);
                    break;
                case 5:
                    System.out.println(a % b);
                    break;
                case 6:
                    System.out.println(a * a);
                    break;
                case 7:
                    System.out.println(a * a * a);
                    break;
                case 9:
                    System.out.println(Math.cbrt(a));
                    break;
                case 10:
                    System.out.println(Math.sqrt(a));
                    break;
                case 8:
                    System.out.println(Math.pow(a, b));
                    break;
                default:
                    System.out.println("!");
            }
            System.out.println("Do u want to continue?(y/n)");
            ch = sc.next().charAt(0);
            if (ch != 'y')
                System.out.println("Thankyou For Tryin' out this Calc");
            continue;
        }
    }
}
