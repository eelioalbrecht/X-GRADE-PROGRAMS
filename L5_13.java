import java.util.*;
class L5_13
{
    String name;
    double basicPay, specialAlw, conveyanceAlw, gross, pf, netSalary, AnnualSal;
    L5_13()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter the basic pay:");
        basicPay = sc.nextDouble();
        conveyanceAlw = 1000.00;
    }
    void SalaryCal()
    {
        specialAlw = 25 / 100.0 * basicPay;
        pf = 10 / 100.0 * basicPay;
        gross = basicPay + specialAlw + conveyanceAlw;
        netSalary = gross - pf;
        AnnualSal = 12 * netSalary;
    }
    void display()
    {
        System.out.println("Name: " +name);
        System.out.println("Basic Pay: " +basicPay);
        System.out.println("Special Allwance: " +specialAlw);
        System.out.println("Conveyance allowance: " +conveyanceAlw);
        System.out.println("Gross: " +gross);
        System.out.println("Provident fund: " +pf);
        System.out.println("Net Salary: " +netSalary);
        System.out.println("Annual Salary: " +AnnualSal);
    }
    public static void main(String args[])
    {
        L5_13 ob = new L5_13();
        ob.SalaryCal();
        ob.display();
    }
}