import java.io.*;
public class factors_factorials //this program prints the factors and factorials of all numbers inputted by user
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter how many numbers you want to calculate.");
        long n=Long.parseLong(y.readLine());
        for(long i=1;i<=n;i++)
        {
            System.out.println();
            System.out.println("Enter next number to be calculated.");
            long x=Long.parseLong(y.readLine());
            System.out.println("The factors of the number are:");
            for(long cnt=1;cnt<=x;cnt++)
            {
                if(x%cnt==0)
                System.out.println("      "+cnt);
            }
            for(long cnt=x-1;cnt>0;cnt--)
            {
                x=x*cnt;
            }
            System.out.println("The number's factorial is "+x);
        }
    }
}
            