import java.util.*;
class wsStr3
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s, w = " ", n;
        int i, c = 0;
        System.out.println("Enter a sentence: ");
        s = sc.nextLine().toUpperCase();
        s = s.trim() + " ";
        System.out.println("Enter a word to be searched: ");
        n = sc.next();
        for(i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if(x!=' ')
                w += x;
            else
            {
                if(w.equals(n))
                    c++;
                w= " ";
            }
        }
        System.out.println("Searched word occurs: "+c+" times");
    }
}