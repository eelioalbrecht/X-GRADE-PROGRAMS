import java.util.*;
class wsStr5
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter a string: ");
        String s = sc.next();
        s = s.trim();
        String r = " ";
        for(i = 0; i < s.length(); i++)
            r = s.charAt(i) + r;
        if(s.equalsIgnoreCase(r))
            System.out.print("Not Palindrome");
        else
            System.out.print("Palindrome");
    }
}