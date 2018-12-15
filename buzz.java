import java.util.*;
public class buzz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a number.");
        int n=sc.nextInt();
        if(n%7==0 || n%10==7)
        System.out.println("The number you have entered IS a buzz number.");
        else
        System.out.println("The number you have entered is NOT a buzz number.");
    }
}