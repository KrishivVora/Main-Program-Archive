import java.io.*;
public class factorials //this program prints the factorial of any number inputted by the user
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter a number.");
        long n=Integer.parseInt(y.readLine());
        System.out.println("Your input is "+n+".");
        for(long cnt=n-1;cnt>0;cnt--)
        {
            n=n*cnt;
        }
        System.out.println("It's factorial is "+n+".");
    }
}