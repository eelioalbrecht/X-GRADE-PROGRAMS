import java.util.*;
class Project_4
{
    public static void main(String [] args)
    {
        System.out.println("---MENU---");
        System.out.println("1. Series");
        System.out.println("2.  Sum of Series");
        System.out.println("Choice: ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        Project_4 obj = new Project_4();
        switch (ch)
        {
            case 1:
                obj.p4i();
                break;
            case 2:
                obj.p4ii();
                break;
            default:
                System.out.println("!INVALID!");
        }
    }
    void p4i()
    {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter an Integer: ");
        int n = sc.nextInt();
        int s = 0, c = 3;
        for(int i=0; i<=n;i++)
        {
            System.out.print(s + " ");
            s += c;
            c += 2;
        }*/
        int n1=2,n2=3,n3,i,count=10;  
        System.out.print(n1+" "+n2);//printing 0 and 1  
        
        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
        {  
            n3=n1+n2;  
            System.out.print(" "+n3);  
            n1=n2;  
            n2=n3;  
        }  
    }
    void p4ii()
    {
        float s = 0;
        for (int i = 1; i<20; i+=2)
            s += (float) i / (i + 1);
        System.out.println("Sum: " +s);
    }
}