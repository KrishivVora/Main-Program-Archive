import java.util.*;
public class rec_reverse
{
    public int reverse(int n, int len)
    {
        int rev=0;
        if(n>9)
        {
            rev=(((n%10)*((int)Math.pow(10, len)))+reverse((n/10), len-1));
        }
        else
        {
            return n;
        }
        return rev;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the number to be reversed.");
        String S=sc.next();
        int size=S.length();
        int x=Integer.parseInt(S);
        System.out.println("The input number is: "+x);
        x=reverse(x, (size-1));
        System.out.println("The reversed number is: "+x);
    }
}