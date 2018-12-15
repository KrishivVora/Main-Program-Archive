import java.io.*;
public class series_2 //this program prints answer for series x/5+x/8+x/11...+x/n where x and n is inputted by user
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("\fEnter number for x and upper limit n.");
        double x=Double.parseDouble(y.readLine());
        int n=Integer.parseInt(y.readLine());
        double a=0;
        for(int cnt=5;cnt<=n;cnt=cnt+3)
        {
            a=a+(x/cnt);
        }
        System.out.println("\fThe sum of the series x/5 + x/8 + x/11... +x/n is equal to "+a);
    }
}