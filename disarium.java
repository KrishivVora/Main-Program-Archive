import java.util.*;
public class disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a number.");
        String S=sc.nextLine();
        S=S.trim();
        int x=S.length();
        int n=Integer.parseInt(S);
        int n1=n;
        int a=0;
        double z=0.0;
        for(int cnt=x; cnt>0; cnt--)
        {
            a=n%10;
            n=n/10;
            z=z+Math.pow(a, cnt);
        }
        if(z==n1)
        System.out.println("The number IS a disarium number.");
        else
        System.out.println("The number is NOT a disarium number.");
    }
}