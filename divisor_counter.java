import java.io.*;
public class divisor_counter //this program prints all factors of any number inputted by the user and counts them
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter a number.");
        int n=Integer.parseInt(y.readLine());
        int i=1;
        System.out.println("The numbers factors are:");
        for(int cnt=1; cnt<=n; cnt++,i++)
        {
            if(n%cnt==0)
            System.out.println(cnt);
        }
        System.out.println("The number has a total of "+i+" factors.");
    }
}