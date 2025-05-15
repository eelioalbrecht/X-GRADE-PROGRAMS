import java.util.*;
class wsStr6
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.next();
        s = s.toLowerCase();
        s = s.trim();
        for (int i = 0; i < s.length(); i++)
            s = s.replace('e', '*');
        System.out.println(s);
    }
}