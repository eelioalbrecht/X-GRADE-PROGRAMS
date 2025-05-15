import java.util.*;
class wsStr2
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.nextLine();
        int i, c = 0;
        String r= " ";
        s = s.toLowerCase();
        for(i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if (x== 'a')
                c++;
            r = x + r;
        }
        System.out.println("Total number of characters: "+c);
    }
}