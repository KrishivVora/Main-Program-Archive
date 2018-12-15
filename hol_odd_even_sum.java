import java.util.*;
public class hol_odd_even_sum
{
    static int a;
    static int b;
    hol_odd_even_sum()
    {
        a=0;
        b=0;
    }
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        hol_odd_even_sum obj=new hol_odd_even_sum();
        System.out.println("\fEnter the limits p and q of the summation.");
        int p=sc.nextInt();
        int q=sc.nextInt();
        obj.summation(p,q);
        System.out.println("The sum of odd numbers is: "+a);
        System.out.println("The sum of even numbers is: "+b);
    }
}