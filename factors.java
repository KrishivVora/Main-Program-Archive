import java.io.*;
public class factors //this program prints all factors of any number inputted by the user
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter a number.");
        int n=Integer.parseInt(y.readLine());
        System.out.println("The number's factors are:");
        for(int cnt=1; cnt<=n; cnt++)
        {
            if(n%cnt==0)
            System.out.println(cnt);
        }
    }
}