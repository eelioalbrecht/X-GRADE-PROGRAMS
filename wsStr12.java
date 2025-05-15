import java.util.*;
class wsStr12
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int i,c = 0;
        System.out.println("Enter a string: ");
        s = sc.nextLine().toUpperCase();
        
        for(i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == s.charAt(i + 1))
                c++;
        }
        System.out.println(s+"\nThe number of double letters are: "+c);
    }
}