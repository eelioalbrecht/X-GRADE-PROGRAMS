import java.util.*;
class ws1_constructor_1
{
    int acc_num;
    String title, author;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the accession no.: ");
        acc_num = sc.nextInt();
        System.out.println("Enter the title: ");
        title = sc.nextLine();
        System.out.println("Enter the author: ");
        author = sc.nextLine();
    }
    void compute()
    {
        Scanner sc = new Scanner(System.in);
        int late, fine;
        System.out.println("Enter the no. of days late: ");
        late = sc.nextInt();
        fine = late * 2;
        System.out.println("Fine: " +fine);
    }
    void display()
    {
        System.out.println("Accession number\t\tTitle\t\tAuthor");
        System.out.println(acc_num+ "\t\t" +title+ "\t\t" +author);
    }
    public static void main(String args[])
    {
        ws1_constructor_1 obj = new ws1_constructor_1();
        obj.input();
        obj.compute();
        obj.display();
    }
}