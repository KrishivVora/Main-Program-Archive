import java.util.*;
public class rec_odd_even_sum
{
    int a=0;
    int b=0;
    public void summation(int m, int n)
    {
        if(m<=n)
        {
            if(m%2==0)
            {
                b+=m;
            }
            else
            {
                a+=m;
            }
            summation(m+1, n);
        }
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the limits p and q of the summation.");
        int p=sc.nextInt();
        int q=sc.nextInt();
        summation(p,q);
        System.out.println("The sum of odd numbers is: "+a);
        System.out.println("The sum of even numbers is: "+b);
    }
}