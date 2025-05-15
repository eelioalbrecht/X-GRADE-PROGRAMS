import java.util.*;
class L4_3
{
 static boolean isPerfect(int n)
 {
 int i,s=0;
 for(i=1;i<n;i++)
 {
 if(n%i==0)
 s+=i;
 }
 if(s==n)
 return true;
 else
 return false;
 }

 static void main()
 {
 Scanner sc=new Scanner(System.in);
 int a,b;
 System.out.println("Enter 2 numbers: ");
 a=sc.nextInt();
 b=sc.nextInt();
 if(isPerfect(a)==true && isPerfect(b)==true)
 System.out.println("Both are prefect numbers");
 else
 System.out.println("Both are not perfect numbers");
 }
}