import java.util.*;
public class hol_prime_triplet
{
    static int pcnt;
    hol_prime_triplet()
    {
        pcnt=0;
    }
    boolean isDivisible(int n, int cnt)
    {
        if(n%cnt==0 && n!=cnt)
        {
            return true;
        }
        if(cnt<(n-1))
        {
            return isDivisible(n, (cnt+1));
        }
        return false;
    }
    boolean isPrime(int n)
    {
        if(isDivisible(n,2)==false && n!=1)
        {
            return true;
        }
        return false;
    }
    void isTriplet(int n)
    {
        if((isPrime(n)==true && isPrime((n+2))==true && isPrime((n+6))==true))
        {
            pcnt+=1;
            System.out.println("Triplet "+pcnt);
            System.out.println(n);
            System.out.println((n+2));
            System.out.println((n+6));
            System.out.println("");

        }
        else if((isPrime(n)==true && isPrime((n+4))==true && isPrime((n+6))==true))
        {
            pcnt+=1;
            System.out.println("Triplet "+pcnt);
            System.out.println(n);
            System.out.println((n+4));
            System.out.println((n+6));
            System.out.println("");
        }
    }
    void rangeprinter(int r1, int r2)
    {
        if(r1<=r2)
        {
            isTriplet(r1);
            rangeprinter((r1+1),r2);
        }
    }
    public static void main(String args[])
    {
        hol_prime_triplet obj=new hol_prime_triplet();
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the ranges of r1 and r2.");
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("The prime triplets between "+r1+" and "+r2+" are:");
        obj.rangeprinter(r1+1,r2-1);
        System.out.println("There are "+pcnt+" total prime triplets within the given range.");
    }
}