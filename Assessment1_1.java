import java.util.*;
class Assessment1_1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, s = 0, ch, x;
        float sum = 0;
        System.out.println("---MENU---");
        System.out.println("1. First Series");
        System.out.println("2. Second Series");
        System.out.println("Enter your choice: ");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            for(i = 2; i <= 18; i += 4)
                s += i - (i + 2);
            System.out.println("Sum: " +s);
            break;
            case 2:
            System.out.println("Enter the value of x: ");
            x = sc.nextInt();
            for(i = 2; i <= 20; i += 3)
                sum += (float)x / i;
            System.out.println("Sum: " +sum);
            break;
            default:
            System.out.println("Invalid choice!");
        }
    }
}