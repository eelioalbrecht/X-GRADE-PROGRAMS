import java.util.*;
class L5_20
{
    double n, r;
    L5_20()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real number: ");
        n = sc.nextInt();
    }
    void roundOff()
    {
        r = Math.round(n * 100) / 100.0;
    }
    void display()
    {
        System.out.println("n= " +n+ "r= " +r);
    }
    public static void main(String [] args)
    {
        L5_20 obj = new L5_20();
        obj.roundOff();
        obj.display();
    }
}