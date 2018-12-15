import java.io.*;
public class prime_checker //this program checks whether inputted number is prime or not
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter a number.");
        int n=Integer.parseInt(y.readLine());
        for(int cnt=2;cnt<=n;cnt++)
        {
            if(n%cnt==0 && cnt!=n)
            {
                System.out.println("The number is not prime.");
                break;
            }
            else if(cnt==n)
            {
                System.out.println("The number is prime.");
                break;
            }
        }
    }
}