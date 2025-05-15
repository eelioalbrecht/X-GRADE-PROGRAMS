import java.util.*;
class pg36023
{
public static void main()
{
Scanner sc = new Scanner(System.in);
int a[] = new int[10], i, j, f;
System.out.println("Enter 10 numbers: ");
for(i = 0; i < 10; i++)
a[i] = sc.nextInt();
for(i = 10; i <= 99; i++)
{
f = 0;
for(j = 0; j < 10; j++)
{
if(a[j] == i)
f++;
}
if(f > 0)
System.out.println("Frequency of " +i+ " is: " +f);
}
}
}