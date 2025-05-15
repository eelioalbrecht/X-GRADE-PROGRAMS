import java.util.*;
class weekendTest1_3
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s = sc.nextLine();
int i,c=0;
 String r= " ";
 //s = s.trim();;
 s=s.toUpperCase();
 int l = s.length();
  System.out.println("Total number of characters:"+l);
 for(i=0;i<l;i++)
 {
 char x=s.charAt(i);
 if (x== 'A' || x=='E' || x=='I' || x=='O' || x=='U')
 c++;
 r=x+r;
 }
 System.out.println("Number of Vowels :"+c);
 System.out.println("Reverse string :"+r);    
}
}