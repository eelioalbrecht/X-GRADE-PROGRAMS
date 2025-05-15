import java.util.*;
class Project_14
{
    void compute()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.nextLine().trim();
        int i, l = s.length();
        String S = s.toLowerCase();
        for(i = 0; i < l; i++)
        {
            char cH = S.charAt(i);
            char CH = s.charAt(i);
            if(cH == 'a' || cH == 'e' || cH == 'i' || cH == 'o' || cH == 'u')
            {
                System.out.print(CH);
                i += 1;
                char Ch = s.charAt(i);
                if(Character.isLowerCase(Ch))
                    System.out.print(Character.toUpperCase(Ch));
                if(Character.isUpperCase(Ch))
                    System.out.print(Character.toLowerCase(Ch));
            }
            else
                System.out.print(CH);
        }
    }
    public static void main(String [] args)
    {
        Project_14 obj = new Project_14();
        obj.compute();
    }
}