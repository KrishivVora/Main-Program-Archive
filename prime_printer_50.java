public class prime_printer_50 //this program prints all prime numbers from 1 to 50
{
    static void method()
    {
        int cnt;
        int n;
        System.out.println("\fThese are the prime numbers from 1 to 50.");
        for(cnt=1;cnt<=50;cnt++)
        {
            for(n=2;n<=cnt;n++)
            {
                if(cnt%n==0 && n<cnt)
                {
                    break;
                }
                else if(cnt==n)
                {
                    System.out.println(cnt);
                }
            }
        }
    }
}