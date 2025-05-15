import java.util.*;
class Project_3 //Taximeter
{
    int taxino, km;
    String name;
    double rate;
    Project_3()//Taximeter()
    {
        taxino = 0;
        name = " ";
        km = 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Taxi no.: ");
        taxino = sc.nextInt();
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Enter the distance travelled: ");
        km = sc.nextInt();
    }
    void calculate()
    {
        if (km == 1 || km > 18)
            rate = 25;
        else if (km > 1 && km <= 6)
            rate = 10;
        else if (km > 6 && km <= 12)
            rate = 15;
        else if (km > 12 && km <= 18)
            rate = 20;
    }
    void display()
    {
        System.out.println(taxino +"\t"+ name +"\t"+ km +"\tRs. "+ rate);
    }
    public static void main(String [] args)
    {
        Project_3 obj = new Project_3();
        obj.input();
        obj.calculate();
        obj.display();
    }
}