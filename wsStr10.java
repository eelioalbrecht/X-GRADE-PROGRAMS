import java.util.*;
class wsStr10
{
    public static void main(String [] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String w = " ";
        int i;
        char x;
        s = s + " ";
        for(i = 0; i < s.length(); i++)
        {
            x = s.charAt(i);
            if(x != ' ')
                w += x;
            else
            {
                System.out.println(w);
                w="";
            }
        }
    }
}