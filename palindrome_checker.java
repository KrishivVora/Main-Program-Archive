import java.io.*;
public class palindrome_checker //this program checks if inputted number is a palindrome
{
    static void method()throws IOException
    {
        BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\fEnter a number, and this perfectly useless program reverses that number.");
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
        if(f==x)
        System.out.println("The number is a palindrome.");
        else
        System.out.println("The number is not a palindrome.");
    }
}