import java.util.*;
public class double_digit_rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a 2 digit number.");
        int a=sc.nextInt();
        int b=a%10;
        int c=a/10;
        int d=(10*b)+c;
        System.out.println("Original number: "+a);
        System.out.println("Reversed number: "+d);
    }
}