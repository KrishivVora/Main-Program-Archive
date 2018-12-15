import java.util.*;
public class rec_powerseries
{
    public double factorial(double f)
    {
        if(f>1)
        {
            f=f*factorial(f-1);
        }
        else
        {
            return 1;
        }
        return f;
    }
    public double power(double a, double m)
    {
        double g=0.0;
        if(m>=1)
        {
            g=a*power(a, m-1);
        }
        else
        {
            return 1;
        }
        return g;
    }
    public double series(double y, double u)
    {
        double sum=0.0;
        if(u>=0)
        {
            sum=(power(y, u)/factorial(u))+series(y, u-1);
        }
        else
        {
            return 0;
        }
        return sum;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the value of x and n.");
        double x=sc.nextDouble();
        double n=sc.nextDouble();
        double output=series(x, n-1);
        System.out.println("The sum of the series is: "+output);
    }
}