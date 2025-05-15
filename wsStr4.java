import java.util.*;
class wsStr4
{
    public static void  main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,c=0;
        System.out.println("Enter a sentence: ");
        s=sc.nextLine();
        s=s.toUpperCase();
        for(i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if (x=='A' || x=='E' || x=='I' || x=='O' || x=='U')
                c++;
        }
        System.out.println("No. of vowels: "+c);
    }
}