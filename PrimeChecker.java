import java.util.*;
public class PrimeChecker
{
    public static void main(String args[])
    {
        System.out.println("\fEnter a number.");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        boolean isPrime=true;
        for(int j=2; j<i; j++)
        {
            if(i%j==0 && i!=j)
            {
                isPrime=false;
            }
        }
        System.out.print(isPrime);
    }
}