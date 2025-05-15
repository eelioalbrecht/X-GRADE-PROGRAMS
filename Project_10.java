import java.util.*;
class Project_10 //Factorial
{
    static int a, i, pro = 1;
    Project_10/*Factorial*/()
    {
        a = 0;
    }
    static void input(int m)
    {
        for(i = 1; i <= m; i++)
        {
            pro = pro * i;
        }
    }
    static void display()
    {
        System.out.println("Factorial: " +pro);
    }
    public static void main(String [] args)
    {
        input(4);
        display();
    }
}