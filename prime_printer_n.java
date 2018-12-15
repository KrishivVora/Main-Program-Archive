import java.io.*;
public class prime_printer_n //this program prints all prime numbers from 1 to n
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter a number, and this program prints all prime numbers from 1 to that number.");
        int n=Integer.parseInt(y.readLine());
        for(int cnt=1;cnt<=n;cnt++)
        {
            for(int x=2;x<=cnt;x++)
            {
                if(cnt%x==0 && x<cnt)
                {
                    break;
                }
                else if(cnt==x)
                {
                    System.out.println(cnt);
                }
            }
        }
    }
}