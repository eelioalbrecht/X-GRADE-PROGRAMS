import java.util.*;
class L5_12
{
    double product_code, pack_size, product_price;
    String flavour, pack_type;
    L5_12()
    {
        product_code = pack_size = product_price = 0;
        flavour = pack_type = " ";
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code: ");
        product_code = sc.nextDouble();
        System.out.println("Enter the flavour: ");
        flavour = sc.nextLine();
        System.out.println("Enter the pack type: ");
        pack_type = sc.nextLine();
        System.out.println("Enter the pack size: ");
        pack_size = sc.nextDouble();
        System.out.println("Enter the product price: ");
        product_price = sc.nextDouble();
    }
    void discount()
    {
        product_price -= 10;
    }
    void display()
    {
        System.out.println("Product code: " +product_code);
        System.out.println("Flavour: " +flavour);
        System.out.println("Pack type: " +pack_type);
        System.out.println("Pack size: " +pack_size);
        System.out.println("Product price: " +product_price);
    }
    public static void main(String args[])
    {
        L5_12 obj=new L5_12();
        obj.input();
        obj.discount();
        obj.display();
    }
}