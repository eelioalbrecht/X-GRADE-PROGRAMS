class ws3_output_1_b
{
    public static void main(String [] args)
    {
        int p = 200;
        while(true)
        {
            if (p < 100)
                break;
            p -= 20;
        }
        System.out.println(p);
    }
}