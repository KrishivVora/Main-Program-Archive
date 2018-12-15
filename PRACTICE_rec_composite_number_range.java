import java.util.*;
public class PRACTICE_rec_composite_number_range
{
    public void printer(int z, int z1)
    {
        int checker=0;
        if (checker>0 || z%2==0 || z%z1!=0)
        {
            System.out.println(z);
        }
        else if(z1>1 && z%z1==0)
        {
            printer(z, z-1);
        }
    }
    public void composite(int m, int n)
    {
        if(m<=n)
        {
            printer(m, ((m/2)+1));
            composite(m+1, n);
        }
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the limits p and q of the operation.");
        int p=sc.nextInt();
        int q=sc.nextInt();
        System.out.println("The composite numbers from "+p+" to "+q+" are:");
        composite(p,q);
    }
}