/*
    *  
   * * 
  * * *
 * * * *
* * * * *
*/


import java.util.*;
public class pattern_6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1; i<=n; i++)
{
	for(int m=n-1; m>=i; m--)
	{
		System.out.print(" ");
	}
	for(int j=0; j<i; j++)
	{
		System.out.print("* ");
	}
	System.out.println();
}
}
}