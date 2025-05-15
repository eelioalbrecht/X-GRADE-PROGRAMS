import java.util.*;
class Project_13
{
    void compute()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine().toUpperCase().trim();
        int i, l = s.length();
        int c = 0, d = 0;
        //char ch = ' ';
        s = " " + s;
        for(i = 0; i < l; i++)
        {
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                c++;
            if(Character.isWhitespace(ch))
                d++;
        }
        System.out.println("Length: " +l);
        System.out.println("No. of Vowels: " +c);
        System.out.println("No. of Words: " +d);
    }
    public static void main(String [] args)
    {
        Project_13 obj = new Project_13();
        obj.compute();
    }
}