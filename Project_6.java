import java.util.*;
class Project_6 //class Employee
{
    static String name, empno;
    static int basic;
    static double da, hra, pf, gross, net;
    Project_6(String N, String E, int B) //Employee()
    {
        name = N;//"eelioalbrecht";
        empno = E;//"ANPS205";
        basic = B;//500000;
    }
    static void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        name = sc.nextLine();
        System.out.println("Enter Employee-number: ");
        empno = sc.nextLine();
        System.out.println("Enter the Basic Pay: ");
        basic = sc.nextInt();
    }
    static void compute()
    {
        da = 30 / 100.0 * basic;
        hra = 15 / 100.0 * basic;
        pf = 12 / 100.0 * basic;
        gross = basic + da + hra;
        net = gross - pf;
    }
    static void display()
    {
        System.out.println("Name: " +name);
        System.out.println("Employee-number: " +empno);
        System.out.println("Gross Salary: " +gross);
        System.out.println("Net Salary: " +net);
    }
    public static void main()
    {
        Project_6 obj1 = new Project_6("eelioalbrecht", "ANPS205", 500000);
        obj1.compute();
        obj1.display();
        System.out.println("----------------------------");
        accept();
        compute();
        display();
    }
}