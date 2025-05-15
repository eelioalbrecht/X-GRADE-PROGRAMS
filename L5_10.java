/*Define a class Taximeter having the following description:
Data members/instance variables:
int taxino - to store taxi number
String name - to store passenger’s name
int km - to store number of kilometers travelled
Member functions:
Taximeter() - constructor to initialise taxino to 0, name to “” and km to 0.
input() - to store taxino,name,km
calculate() - to calculate bill for a customer according to given conditions
Kilometers travelled(km) Rate/km
1 km           ` 25
1 < km ≤ 6     ` 10
6 < km ≤ 12    ` 15
12 < km ≤ 18   ` 20
>18 km         ` 25
display()- To display the details in the following format
Taxino      Name        Kilometres travelled        Bill amount*/
import java.util.*;
class L5_10
{
    int taxino, km;
    String name;
    L5_10()
    {
        taxino = 0;
        name = " ";
        km = 0;
    }
    void input()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the taxi no.: ");
        taxino = sc.nextInt();
        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter the kilometer: ");
        km = sc.nextInt();
    }
    int calculate()
    {
        int bill = 0;
        if (km == 1)
            bill = 25 * km;
        else if(km > 1 && km <= 6)
            bill = 10 * km;
        else if(km > 6 && km <= 12)
            bill = 15 * km;
        else if(km > 12 && km <= 18)
            bill = 20 * km;
        else
            bill = 25 * km;
        return bill;
    }
    void display()
    {
        System.out.println("Taxino\t\tName\t\tKilomtres travelled\t\tBill amount");
        System.out.println(taxino+"\t\t"+name+"\t\t"+km+"\t\t"+calculate());
    }
    public static void main(String [] args)
    {
        L5_10 obj = new L5_10();
        obj.input();
        obj.calculate();
        obj.display();
    }
}