import java.util.*;
public class rec_permutation
{
    public int factorial(int f)
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
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the value of n and r.");
        int n=sc.nextInt();
        int r=sc.nextInt();
        int output=factorial(n)/factorial(n-r);
        System.out.println("The answer of n! / (n-r)! is: "+output);
    }
}