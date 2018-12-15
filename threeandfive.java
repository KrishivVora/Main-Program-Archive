public class threeandfive //to get the sum of all the multiples of 3 and 5 upto 1000
{
    public static void main()
    {
        double a=1.0d;
        for(double i=1.0d; i<=1000.0d; i++)
        {
            if(i%3.0==0.0 || i%5.0==0.0)
            {
                a=a+i;
            }
        }
        int b=(int)a;
        System.out.println("\fThe sum of all products of 3 and 5 til 1000 is: "+b);
    }
}