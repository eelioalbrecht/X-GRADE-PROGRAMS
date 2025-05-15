import java.util.*;
class L5_11
{
    int a, b;
    L5_11(int x, int y)
    {
        a = x;
        b = y;
    }
    int sum()
    {
        return a + b;
    }
    void display()
    {
        System.out.println("a= " +a+ "b= " +b);
    }
    /*
     static void compare(Numbers ob1,Numbers ob2)
    {
        if (ob1.sum() > ob2.sum())
            ob1.display();
        else
            ob2.display();
    }
     */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter 2 numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        L5_11 ob1=new L5_11(x,y);
        System.out.println("Enter 2 numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();
        //Numbers ob2=new Numbers(x,y);
        //compare(ob1,ob2);
    }
}