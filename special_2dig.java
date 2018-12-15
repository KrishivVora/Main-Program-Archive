import java.util.*;
public class special_2dig
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a 2 digit number.");
        int a=sc.nextInt();
        int b=a%10;
        int c=a/10;
        int d=b+c;
        int e=b*c;
        int f=d+e;
        if(f==a)
        System.out.println("The number IS a special number.");
        else
        System.out.println("The number is NOT a special number.");
    }
}