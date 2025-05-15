import java.util.*;
class L5_15
{
String customerName;
long phoneNumber;
int no_of_units,rent;
float amount;
void calculate()
{
    float cost = 0;
    if(no_of_units <= 50)
        cost = 0;
    else if(no_of_units > 50 && no_of_units <= 150)
        cost = 50 * 0 + (no_of_units - 50) * 0.80f;
    else if(no_of_units > 150 && no_of_units <= 350)
        cost = 50 * 0 + 100 * 0.80f + (no_of_units - 150) * 1.00f;
}
L5_15()
{
    customerName =  "Raju";
    phoneNumber = 259461;
    no_of_units = 50;
    amount = rent = 100;
}
void accept()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the customer name: ");
    customerName = sc.nextLine();
    System.out.println("Enter the phone number: ");
    phoneNumber = sc.nextLong();
    System.out.println("Enter the no. of units: ");
    no_of_units = sc.nextInt();
    System.out.println("Enter the rent: ");
    rent = sc.nextInt();
}
void Display()
{
    System.out.println("Customer name: "+customerName);
    System.out.println("Phone number: "+phoneNumber);
    System.out.println("No. of units: "+no_of_units);
    System.out.println("Rent: "+rent);
    System.out.println("Amount: "+amount);
}
public static void main(String args[])
{
    L5_15 obj = new L5_15();
    obj.accept();
    obj.calculate();
    obj.Display();
}
}