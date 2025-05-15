import java.util.*;
class wsStr11
{
    static String s;
    static int l, nv, nw, i;
    static void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s = sc.nextLine().toUpperCase();
    }
    static void length()
    {
        l = s.length();
        System.out.println("Length: " +l);
    }
    static void vowels()
    {
        for(i = 0; i < l; i++)
        {
            char x = s.charAt(i);
            if(x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
                nv++;
        }
        System.out.println("Number of Vowels: " +nv);
    }
    static void words()
    {
        for (int i = 0; i < s.length() - 1; i++)
        {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
                nw++;
        }
        System.out.println("Number of Words: " +nw);
    }
    public static void main(String [] args)
    {
        input();
        length();
        vowels();
        words();
    }
}