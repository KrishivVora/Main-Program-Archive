public class series_3 //this program prints the squares of the first 10 natual numbers, but stops as soon as a square is divisible by 2, 3 and 4
{
    static void method()
    {
        double a;
        System.out.println("\f");
        for(int cnt=1;cnt<=10;cnt++)
        {
            a=Math.pow(cnt,2);
            if(a%2==0 && a%3==0 && a%4==0)
            break;
            System.out.println(a);
        }
    }
}