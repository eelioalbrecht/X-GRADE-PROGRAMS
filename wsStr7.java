import java.util.*;
class wsStr7
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s, n = " ";
        int i, c = 0;
        System.out.println("Enter a sentence: ");
        s = sc.nextLine();
        for(i = 0; i <s.length(); i++)
        {
            char x = s.charAt(i);
            if(x>='A' && x<='Z')
                x = (char) (x + 32);
            else if(x>='a' && x<='z')
                x=(char)(x-32);
            n = n + x;
        }
        System.out.println("New sentence: "+n);
    }
}