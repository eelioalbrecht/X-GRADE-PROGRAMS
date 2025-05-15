import java.util.*;
class weekendTest1_1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s = sc.nextLine();
	String r = "";
        boolean v = true;
	for (int i = 0; i < s.length(); i++)
	{
	    if (s.charAt(i) == ' ')
		System.out.print(r);
	    else if (s.charAt(i) != ' ' && v == true)
	    {
		r += (s.charAt(i));
		System.out.print(r);
            }
        }
        System.out.print(r);
    }
}