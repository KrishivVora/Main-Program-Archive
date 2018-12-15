import java.util.*;
public class mid_digit_checker
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a 3 digit number.");
        int a=sc.nextInt();
        int b=(a%100)/10;
        System.out.println("Middle digit is "+b);
        if(b%2==0)
        System.out.println("Middle digit is even.");
        else
        System.out.println("Middle digit is odd.");
        System.out.println("Square of middle digit: "+Math.pow(b,2));
        System.out.println("Cube of middle digit: "+Math.pow(b,3));
    }
}