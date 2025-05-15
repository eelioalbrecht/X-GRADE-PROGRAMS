class ws4userDefined_output_6 //class customer
{
    private long cust_id;
    String cust_name;
    ws4userDefined_output_6(long id, String n)
    {
        cust_id = id;
        cust_name = n;
    }
    public char funct()
    {
        System.out.println(cust_id+ "\t" +cust_name);
        char chr = '#';
        return chr;
    }
    public static void main(String [] args)
    {
        ws4userDefined_output_6 obj = new ws4userDefined_output_6(2019406, "S. Pranav Sastry");
        obj.funct();
    }
}