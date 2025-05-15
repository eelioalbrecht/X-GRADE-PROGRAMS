import java.util.*;
class ArrProgramsWs5
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10], i, t;
        System.out.println("Enter 10 numbers: ");
        for(i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        for(i=0;i<5;i++)
        {
            t = arr[i];
            arr[i] = arr[9-i];
            arr[9-i] = t;
        }
        System.out.println("Rev: ");
        for(i=0;i<10;i++)
            System.out.print(arr[i]+ " ");
    }
}