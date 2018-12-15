import java.util.*;
public class factorial_zero_counter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=1;
        System.out.println("\fEnter a number.");
        int x=sc.nextInt();
        for(int cnt=x; cnt>1; cnt--)
        {
            n=n*cnt;
        }
        System.out.println("The factorial of "+x+" is "+n+".");
        StringBuffer S=new StringBuffer();
        S=S.append(n);
        S=S.reverse();
        char c=S.charAt(0);
        int i=1;
        do
        {
            if(S.charAt(0)!='0')
            {
                i--;
                break;
            }
            c=S.charAt(i);
            if(c!='0')
            {
                break;
            }
            i++;
        }
        while(i<S.length());
        System.out.println("Number of trailing zeroes in "+n+" is "+i+".");
        System.out.println("Rerun? (y/n)");
        c=sc.next().charAt(0);
        if(c=='y')
        main(args);
        else
        System.exit(0);
    }
}
