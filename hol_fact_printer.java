import java.util.*;
public class hol_fact_printer
{
	int factorial(int x)
	{
		if(x==0)
		return 1;
		return x*factorial(x-1);
	}
	int rangeprinter(int m, int n)
	{
		System.out.println(m+": "+factorial(m));
		if(m==n)
		{
			return 0;
		}
		return rangeprinter(m+1, n);
	}
	public static void main(String args[])
	{
		hol_fact_printer obj=new hol_fact_printer();
		Scanner sc=new Scanner(System.in);
		System.out.println("\fEnter the ranges of m and n.");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("The factorials of the numbers between "+m+" and "+n+" are:");
		int h=obj.rangeprinter(m+1,n-1);
	}
}