/*Define a class named Conversion having the following static methods:
i. int mTocm(int m ), which converts metre(m) to centimeter and return it.
ii. int multiply(int x, int y ), which returns the product of x and y.
Define another class named Rectangle which contains the following data members:
• length of int type which holds the length of a rectangle in metre.
• breadth of int type which holds the breadth of a rectangle in centimeter.
Create member functions:
i. Constructor to initialise the data members.
ii. Convert the length to centimetre by calling the relevant method of the above class.
iii. Compute the area by calling the relevant method of the above class and display the result.*/
class L5_5
{
    int n, s;
    int mTocm(int m)
    {
        return m * 100;
    }
    int multiply(int x, int y)
    {
        return x * y;
    }
}
public class Rectangle
{
    int length, breadth;
    Rectangle(int m, int cm)
    {
        length = m;
        breadth = cm;
    }
    void convert()
    {
        length = new L5_5().mTocm(length);
    }
    void compute()
    {
        int area;
        convert();
        area = new L5_5().multiply(length,breadth);
        System.out.println("Area: " +area);
    }
}