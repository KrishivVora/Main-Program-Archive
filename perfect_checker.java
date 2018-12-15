import java.io.*;
public class perfect_checker //this program checks whether inputted number is perfect or not
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter a number.");
        int n=Integer.parseInt(y.readLine());
        int a=0;
        int cnt=1;
        for(cnt=1; cnt<=n; cnt++)
        {
            if(n%cnt==0 && n!=cnt)
                a=a+cnt;
        }
        if(a==n)
            System.out.println("The number is a perfect number.");
        else
            System.out.println("The number is not a perfect number.");
    }
}