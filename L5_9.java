/*You are to print the telephone bill of a subscriber. Create a class having the following data members:
Phone Number of long data type (for storing the phone number).
Name of String type (for storing the name of a the subscriber).
Hire Charge a symbolic constant of int type (to store monthly hire charge say `. 200).
Units Consumed of int type (to store the monthly units consumed by the subscriber).
Bill Amount of float type (to store the bill amount that is payable).
Create member functions for the following:
i. Constructor to initialise all data members except Hire Charge and Bill Amount.
ii. Calculate the bill amount payable which is Hire Charge+(`. 1 per unit for the first 100 units, Rs. 1.50 per unit for the next 100 units and `. 2.00 per unit there after.
iii. To display the Bill for the subscriber.*/
import java.util.*;
class L5_9
{
    long pno;
    String name = " ";
    int hire;
    int units;
    float bill;
    String month = "";
    L5_9(long p, String n, int u)
    {
        pno = p;
        name = n;
        units = u;
    }
    void calculate()
    {
        hire = 200;
        bill = 0;
        if (units <= 100)
            bill = hire + units * 1;
        else if(units > 100 && units <= 200)
            bill = hire + 100 * 1 + (units - 100) * 1.50f;
        else
            bill = hire + 100 * 1 + 100 * 1.50f + (units - 200) * 2;
    }
    void show()
    {
        System.out.println("BILL");
        System.out.println("Phone No.: " +pno);
        System.out.println("Name: " +name);
        System.out.println("Hire Charge: " +hire);
        System.out.println("Units consumed: " +units);
        System.out.println("Bill: " +bill);
    }
}