import java.util.*;
class L5_16
{
String s_name;
long s_code;
int fees, duration;
L5_16()
{
    s_name = "Cricket";
    s_code = 1001;
    fees = 500;
    duration = 70;
}
void newL5_16()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the code: ");
    s_code = sc.nextLong();
    System.out.println("Enter the L5_16 name: ");
    s_name = sc.nextLine();
    System.out.println("Enter the duration: ");
    duration = sc.nextInt();
    if(s_name.equalsIgnoreCase("Table Tennis"))
        fees = 2000;
    else if(s_name.equalsIgnoreCase("Swimming"))
        fees = 4000;
    if(s_name.equalsIgnoreCase("Football"))
        fees = 3000;
}
void displayL5_16()
{
    System.out.println("Code: " +s_code);
    System.out.println("L5_16 name: " +s_name);
    System.out.println("Duration: " +duration);
    System.out.println("Fees: " +fees);
}
public static void main(String [] args)
{
    L5_16 obj = new L5_16();
    obj.newL5_16();
    obj.displayL5_16();
}
}