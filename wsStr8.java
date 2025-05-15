import java.util.*;
class wsStr8
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i, u = 0, l = 0;
        char c;
        System.out.println("Enter 10 characters: ");
        for(i = 1; i <= 10; i++)
        {
            c = sc.next().charAt(0);
            if(Character.isUpperCase(c))
                u++;
            else if(Character.isLowerCase(c))
                l++;
        }
        System.out.println("Uppercase Frequency: "+u);
        System.out.println("Lowercase Frequency: "+l);
    }
}