import java.io.*;
public class number_reverser //this program reverses inputted number
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter a number");
        int n=Integer.parseInt(y.readLine());
        int a=0;
        int x=n;
        int f=0;
        do
        {
            a=n%10;
            n=n/10;
            f=(f*10)+a;
        }
        while(n>0);
        System.out.println("The reversed number is "+f);
    }
}