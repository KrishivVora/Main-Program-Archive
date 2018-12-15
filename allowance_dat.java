import java.util.*;
import java.io.*;
public class allowance_dat
{
    public static void main(String args[]) throws IOException
    {
        FileOutputStream fs=new FileOutputStream("C:\\Program Files (x86)\\BlueJ\\Krishiv Vora Main Project\\Text Files\\allowance.dat");
        DataOutputStream ds=new DataOutputStream(fs);
        Scanner sc=new Scanner(System.in);
        System.out.println("\fHow many employees would you like to enter data for?");
        int N=sc.nextInt();
        double basic=0.0, HRA=0.0, DA=0.0, salary=0.0, special=0.0;
        int code=0;
        String name;
        System.out.println("NO.     NAME		EMP CODE	BASIC PAY	   HRA	    DA	     SALARY      ALLOW       TOTAL");
        for(int cnt=0; cnt<N; cnt++)
        {
            System.out.println("Enter the name and employee code of the employee.");
            name=sc.nextLine();
            code=sc.nextInt();
            System.out.println("Enter the basic salary of the employee.");
            basic=sc.nextInt();
            HRA=0.30*basic;
            DA=0.40*basic;
            salary=basic+HRA+DA;
            if(code<=15 && salary<=15000.0 && (0.2*salary)<2500.0)
            {
                special=0.2*salary;
            }
            else if((int)code<=15 && salary<=15000.0 && (0.2*salary)>2500.0)
            {
                special=2500.0;
            }
            else if((int)code>15)
            {
                special=1000.0;
            }
            salary=salary+special;
        }
        ds.close();
        fs.close();
    }
}