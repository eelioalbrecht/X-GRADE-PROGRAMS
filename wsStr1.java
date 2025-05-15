import java.util.*;
class wsStr1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        String s, w = "";
        char x;
        System.out.println("Enter a String: ");
        s = sc.nextLine();
        s = s + " ";
        for (i = 0; i < s.length(); i++)
        {
            x = s.charAt(i);
            if(x != ' ')
                w += x;
            else
            {
                System.out.print(w + "\t");
                w = "";
            }
        }
    }
}