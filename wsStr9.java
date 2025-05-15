import java.util.*;
class wsStr9
{
    public static void main(String [] args)
    {
        String s, n = " ";
        char x;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s = sc.nextLine();
        for(i = 0; i < s.length(); i++)
        {
            x = s.charAt(i);
            if("AEIOUaeiou".indexOf(x) == -1)
                n += x;
        }
        System.out.println(n);
    }
}