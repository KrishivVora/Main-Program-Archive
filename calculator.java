import java.util.*;
public class calculator
{
    public static void repeat()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Would you like to do another calculation? (Y/N)");
        String f=sc.next();
        char g=f.charAt(0);
        if(g=='Y' || g=='y')
        {
            main();
        }
        else if(g=='N' || g=='n')
        {
            System.out.println("\fThanks for using this calculator!");
            System.out.println("Program terminated.");
        }
    }
    public static void add(double x, double y)
    {
        double ans=x+y;
        System.out.println(ans);
    }
    public static void subtract(double x, double y)
    {
        double ans=x-y;
        System.out.println(ans);
    }
    public static void multiply(double x, double y)
    {
        double ans=x*y;
        System.out.println(ans);
    }
    public static void divide(double x, double y)
    {
        double ans=x/y;
        if(y==0)
        {
            System.out.println("Why are you trying to break the universe?");
            repeat();
        }
        System.out.println(ans);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter two numbers. (now supports decimals)!");
        double n1=sc.nextInt();
        double n2=sc.nextInt();
        System.out.println("Choose your operation!");
        System.out.println("Press 1 for addition.");
        System.out.println("Press 2 for subtraction.");
        System.out.println("Press 3 for multiplication.");
        System.out.println("Press 4 for division.");
        int a=sc.nextInt();
        switch(a)
        {
            case 1: add(n1,n2);
            break;
            case 2: subtract(n1,n2);
            break;
            case 3: multiply(n1,n2);
            break;
            case 4: divide(n1,n2);
            break;
            default: System.out.println("Error");
        }
        repeat();
    }
}