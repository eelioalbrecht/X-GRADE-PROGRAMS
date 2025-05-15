class Natural
{
 int n,s;
 Natural(int t)
 {
 n=t;
 }
 void compute()
 {
 s = n*(n+1)/2;
 }
 void display()
 {
     System.out.println(s);
 }
}