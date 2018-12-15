public class series_1 //this program prints answer for series 2-4+6....-20
{
    static void method()
    {
        int n=0;
        for(int cnt=2;cnt<=20;cnt=cnt+2)
        {
            n=n+cnt;
            cnt=cnt+2;
            n=n-cnt;
        }
        System.out.println("\fThe sum of the series 2-4+6...-20 is equal to "+n);
    }
}