import java.util.*;
public class hol_prime_printer
{
    boolean isDivisible(int x, int cnt)
    {
        if(x%cnt==0 && x!=cnt)
        {
            return true;
        }
        if(cnt<(x-1))
        {
            return isDivisible(x, (cnt+1));
        }
        return false;
    }
    void prime(int x)
    {
        if(isDivisible(x,2)==false && x!=1)
        {
            System.out.println(x);
        }
    }
    void rangeprinter(int m, int n)
    {
        if(m<=n)
        {
            prime(m);
            rangeprinter((m+1),n);
        }
    }
    public static void main(String args[])
    {
        hol_prime_printer obj=new hol_prime_printer();
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the ranges of m and n.");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("The primes between "+m+" and "+n+" are:");
        obj.rangeprinter(m+1,n-1);
    }
}