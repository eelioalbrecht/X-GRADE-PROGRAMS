import java.util.*;
class ArrProgramsWs14
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i <= 4; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0)
                arr[i] = arr[i] * arr[i] * arr[i];
            else
                arr[i] = arr[i] * arr[i];
            System.out.println(arr[i]);
            }
    }
}