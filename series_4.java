import java.io.*;
public class series_4 //this program prints the series 2^n, from n to n+10 until n exceeds 100
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter a number.");
        int n=Integer.parseInt(y.readLine());
        double a=0;
        for(int cnt=0;cnt<=10;cnt++,n++)
        {
            a=Math.pow(2,n);
            if(a>100)
            break;
            System.out.println(a);
        }
    }
}