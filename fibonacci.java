public class fibonacci //this program prints the first 15 terms of the legendary Fibonacci sequence
{
    static void method()
    {
        int a=0;
        int b=1;
        int cnt=0;
        System.out.print("\f");
        System.out.println("0");
        while(cnt<=13)
        {
            b=b+a;
            a=a+b;
            System.out.println(b);
            System.out.println(a);
            cnt=cnt+2;
        }
    }
}