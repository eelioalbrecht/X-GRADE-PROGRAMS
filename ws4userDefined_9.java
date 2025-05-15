import java.util.*;
class ws4userDefined_9 //class Parkinglot
{
    int vno, hours;
    double bill;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Vehicle number: ");
        vno = sc.nextInt();
        System.out.println("Enter the number of hours");
        hours = sc.nextInt();
    }
    void calculate()
    {
        if (hours <= 1)
            bill = hours * 3;
        else
            bill = 3 * 1 + (hours - 1) * 1.50;
    }
    void display()
    {
        System.out.println("Vehicle number: " +vno);
        System.out.println("Number of hours: " +hours);
        System.out.println("Bill: " +bill);
    }
    public static void main(String [] args)
    {
        ws4userDefined_9 obj = new ws4userDefined_9();
        obj.input();
        obj.calculate();
        obj.display();
    }
}