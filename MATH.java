import java.util.*;
class MATH
{
    public static void main(String [] args)
    {
        System.out.println("---MENU---");
        System.out.println("1. Interest");
        System.out.println("2. Maturity Value");
        System.out.println("3. Mean (n = odd)");
        System.out.println("4. Mean (n = even)");
        System.out.println("5. Median (n = odd)");
        System.out.println("6. Median (n = even)");
        System.out.println("7. Section Formula");
        System.out.println("8. Mid-point Formula");
        System.out.println("9. Coordinates of Centroid");
        System.out.println("10. Transpose of Matrix: ");
        System.out.println("Choice: ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        MATH obj = new MATH();
        switch (ch)
        {
            case 1:
                obj.p1();
                break;
            case 2:
                obj.p2();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                //obj.p10();
            default:
                System.out.println("!INVALID!");
        }
    }
    void p1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following values: ");
        System.out.println("Principal (P): ");
        int P = sc.nextInt();
        System.out.println("Rate of Interese (R): ");
        int R = sc.nextInt();
        System.out.println("Time (n)[in months]: ");
        int n = sc.nextInt();
        double I = (P*n*(n+1)*R)/(2*12*100);
        System.out.print("Interest: Rs." +I);
    }
    void p2()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following values: ");
        System.out.println("Principal (P): ");
        int P = sc.nextInt();
        System.out.println("Rate of Interese (R): ");
        int R = sc.nextInt();
        System.out.println("Time (n)[in months]: ");
        int n = sc.nextInt();
        double MV = (P*n)+(P*n*(n+1)*R)/(2*12*100);
        System.out.print("Maturity Value: Rs." +MV);
    }
    
}