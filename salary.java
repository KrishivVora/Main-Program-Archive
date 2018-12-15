import java.util.*;
public class salary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter basic salary of employee.");
        double basic=sc.nextDouble();
        double da=0.75*basic;
        double hra=0.25*basic;
        double pf=0.12*(basic+da);
        double gross=basic+da+hra;
        double net=gross-pf;
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Basic Salary: "+basic);
        System.out.println("Dearness Allowance: "+da);
        System.out.println("House Rent Allowance: "+hra);
        System.out.println("Provident Fund: "+pf);
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);
    }
}