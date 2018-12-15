import java.util.*;
public class niven
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
        int z=0;
        for(int cnt=0; cnt<x; cnt++)
        {
            a=n%10;
            n=n/10;
            z=z+a;
        }
        if(n1%z==0)
        System.out.println("The number IS a Niven number.");
        else
        System.out.println("The number is NOT a Niven number.");
    }
}