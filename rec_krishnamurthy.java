import java.util.*;
public class rec_krishnamurthy
{
    int output=0;
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
    public int digitrem(int r)
    {
        if(r>=10)
        {
            output=factorial(r%10)+digitrem(r/10);
        }
        else if(r<10)
        {
            output=factorial(r);
        }
        return output;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int n=sc.nextInt();
        int outputx=digitrem(n);
        if(output==n)
        {
            System.out.println("The number is a Krishnamurthy number.");
        }
        else
        {
            System.out.println("The number is NOT a Krishnamurthy number.");
        }
    }
}