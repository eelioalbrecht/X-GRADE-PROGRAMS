import java.util.*;
class Project_11
{
    void calc()
    {
        int i, uc = 0, lc = 0, spl = 0;
        System.out.println("Enter 10 character: ");
        Scanner sc=new Scanner(System.in);
        char c;
        for(i = 1; i <= 10; i++)
        {
            c=sc.next().charAt(0);
            if (Character.isLetter(c))
            {
                if (Character.isUpperCase(c))
                    uc++;
                else
                    lc++;
            }
            else
                spl++;
        }
        System.out.println("Frequency of Upper Case Letters: "+ uc);
        System.out.println("Frequency of Lower Case Letters: "+ lc);
        System.out.println("Frequency of Special Characters/ Numbers: "+ spl);
    }
    public static void main(String [] args)
    {
        Project_11 obj =  new Project_11();
        obj.calc();
    }
}