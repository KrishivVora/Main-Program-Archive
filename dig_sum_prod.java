import java.util.*;
public class dig_sum_prod
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
        System.out.println("Sum of digits    : "+d);
        System.out.println("Product of digits: "+e);
    }
}