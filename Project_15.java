import java.util.*;
class Project_15
{
    void compute()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine().trim();
        int i, l = s.length();
        for(i = l-1; i >= 0; i--)
        {
            char ch = s.charAt(i); 
            s += ch;
        }
        System.out.println(s);
    }
    public static void main(String [] args)
    {
        Project_15 obj = new Project_15();
        obj.compute();
    }
}