import java.io.*;
public class prime_printer_xy //this program prints all prime numbers from x to y
{
    static void method()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter a lower limit and an upper limit, and this program prints all prime numbers from 'x' to 'y'.");
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
        if(x>y)
        System.out.println("BZZT!!! 'x' cannot be greater than 'y'!");
        for(int cnt=x;cnt<=y;cnt++)
        {
            for(int i=2;i<=cnt;i++)
            {
                if(cnt%i==0 && i<cnt)
                {
                    break;
                }
                else if(i==cnt)
                {
                    System.out.println(cnt);
                }
            }
        }
    }
}