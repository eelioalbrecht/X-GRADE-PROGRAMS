import java.util.*;
class ws1_constructor_2
{
    String name;
    int age, m1, m2, m3, max;
    float avg;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter marks in 3 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        System.out.println("Enter your age: ");
        age=sc.nextInt();
    }
    void display()
    {
        System.out.println("Name: " +name);
        System.out.println("Marks: " +m1+ ", " +m2+ " and " +m3);
        System.out.println("Maximum Marks: " +max);
        System.out.println("Average: " + avg);
    }
    void compute()
    {
        max = Math.max(Math.max(m1, m2), m3);
        avg = (float)(m1 + m2 + m3) / 3;
    }
    public static void main(String args[])
    {
        ws1_constructor_2 ob=new ws1_constructor_2();
        ob.input();
        ob.compute();
        ob.display();
    }
}