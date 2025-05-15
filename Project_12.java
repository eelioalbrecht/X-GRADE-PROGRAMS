import java.util.*;
class Project_12
{
    void palindrome()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = sc.nextLine().trim();
        String N = "";
        int l = s.length();
        for(int i = 0; i < l; i++)
        {
            char ch = s.charAt(i);
            N = ch + N;
        }
        if(s.equalsIgnoreCase(N))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static void main(String [] args)
    {
        Project_12 obj = new Project_12();
        obj.palindrome();
    }
}