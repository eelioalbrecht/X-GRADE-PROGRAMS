class ws3_output_2_a
{
    static void series()
    {
        int sum = 0, n = 3;
        for(int i = 1; i <= n; i++)
            sum = sum + i * i;
        System.out.println(sum);
    }
    public static void main(String [] args)
    {
        series();
    }
}