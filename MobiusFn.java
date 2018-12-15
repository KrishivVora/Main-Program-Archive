import java.util.*;
public class MobiusFn /*Mobius Function is such that:
                        μ(n) = 1 if n is a square-free positive integer with an even number of prime factors.
                        μ(n) = −1 if n is a square-free positive integer with an odd number of prime factors.
                        μ(n) = 0 if n has a squared prime factor. */
{
    int n;
    MobiusFn()
    {
        n = 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        n=sc.nextInt();
    }
    int PrimeFac()
    {
        int nx = n;
        int fcnt = 0;
        boolean isPrime = true;
        boolean isRepetition = false;
        String List = new String();
        for(int i=2; i<=nx; i++) //checking all numbers below input to see if they are prime, dividing input by them if they are
        {
            isPrime=true;
            for(int j=2; j<=i; j++) //to check if factor is prime
            {
                if(i%j==0 && i!=j)
                {
                    isPrime = false;
                }
            }
            if(isPrime && nx%i==0) //if number is prime factor
            {
                if(List.contains((i+" ")))
                {
                    isRepetition = true;
                }
                List = List+i+" "; //adds prime factor to list
                fcnt += 1; //increments prime factor counter
                nx = nx/i; //replaces input number with quotient
                i = 1; //resets prime generator (to check for duplicates)
            }
        }
        if(isRepetition)
        {
            fcnt = 0;
        }
        System.out.println(List);
        return fcnt;
    }
    void display()
    {
        int m;
        int p=PrimeFac();
        if(n==1)
        {
            m=1; //as per question
        }
        else if(p==0)
        {
            m=0; //return value 0 can only mean repetition is detected, in which case question indicates m=0
        }
        else
        {
            m=(int)Math.pow(-1, p); //as per question
        }
        System.out.println("For the input "+n+", the Mobius function M(n) returns "+m);
    }
    public static void main(String args[])
    {
        MobiusFn obj = new MobiusFn();
        obj.input();
        obj.display();
    }
}