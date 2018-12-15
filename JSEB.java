import java.util.*;
public class JSEB
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the number of units consumed.");
        int n=sc.nextInt();
        double cost=0.0;
        if(n<=50)
        {
            cost=0.0;
        }
        else if(n>50 && n<=100)
        {
            cost=(n-50)*0.75;
        }
        else if(n>100 && n<=250)
        {
            cost=(50*0.75)+((n-100)*1.25);
        }
        else if(n>250 && n<=500)
        {
            cost=(50*0.75)+(100*1.25)+((n-250)*2.50);
        }
        else if(n>500)
        {
            cost=(50*0.75)+(100*1.25)+(250*2.50)+((n-500)*3.00);
        }
        cost=cost/100.0;
        System.out.println("The cost of the power is Rs "+cost);
    }
}