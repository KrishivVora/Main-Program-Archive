import java.util.*;
public class swap_2 //to swap two numbers using two variables
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the two numbers to be swapped, one by one.");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Before swapping: x= "+x);
        System.out.println("                 y= "+y);
        System.out.println();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(" After swapping: x= "+x);
        System.out.println("                 y= "+y);
    }
}