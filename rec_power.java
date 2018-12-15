import java.util.*;
public class rec_power
{
    public int power(int a, int n)
    {
        int output=0;
        if(n>=1)
        {
            output=a*power(a, n-1);
        }
        else
        {
            return 1;
        }
        return output;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the value of a and n.");
        int a=sc.nextInt();
        int n=sc.nextInt();
        int output=power(a,n);
        System.out.println("The answer of a^n is: "+output);
    }
}