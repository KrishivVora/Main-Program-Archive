import java.io.*;
public class square_checker
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("\fEnter a number.");
        int n=Integer.parseInt(y.readLine());
        double a=Math.pow(n,0.5);
        if(n%a==0)
        {
            System.out.println("The number "+n+" is a perfect square of "+a);
        }
    }
}