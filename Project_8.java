import java.util.*;
class Project_8
{
    static int num;
static void calc(int n)
{
int i, c = 0, r = 0;
for(i = 0; i<=9; i++)
{
    num = n;
    while(num != 0)
    {
        r = num % 10;
        if(r == i)
        System.out.print(r +", ");
        num /= 10;
    }
}
}
public static void main(String [] args)
{
calc(4972);
}
}