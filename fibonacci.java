import java.util.*;
public class fibonacci //this program prints the terms till n of the legendary Fibonacci sequence
{
    static void method()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a number.");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("0");
        while(b<n)
        {
            b=b+a;
            a=a+b;
            if(b>n)
            break;
            System.out.println(b);
            if(a>n)
            break;
            System.out.println(a);
        }
    }
}