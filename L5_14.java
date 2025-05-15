import java.util. * ;
class L5_14
{
    double pamt,  rate;
    int time;
    L5_14()
    {
        pamt = rate = 0.0;
        time = 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal:");
        pamt = sc.nextDouble();
        System.out.println("Enter the rate:");
        rate = sc.nextDouble();
        System.out.println("Enter the time:");
        time = sc.nextInt();
    }
    double findInterest()
    {
        double ci;
        ci = pamt * Math.pow((1 + rate / 100.0), time) - pamt;
        return ci;
    }
    void printData()
    {
        System.out.println("Principal:" + pamt);
        System.out.println("Rate:" + rate);
        System.out.println("Time:" + time);
    }
    public static void main(String args[])
    {
        L5_14 obj = new L5_14();
        obj.input();
        obj.printData();
        System.out.println("L5_14 Interest:" + obj.findInterest());
    }
}