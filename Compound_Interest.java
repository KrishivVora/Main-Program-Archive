public class Compound_Interest
{
    static void method(double P, double r, double t)
    {
        double n=12;
        double b=1+(r/n);
        double A=Math.pow(P*b,n*t);
        double Amt=P+A;
    }
}