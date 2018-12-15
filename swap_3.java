import java.util.*;
public class swap_3 //to swap two numbers using three variables
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
        int temp=y;
        y=x;
        x=temp;
        System.out.println(" After swapping: x= "+x);
        System.out.println("                 y= "+y);
    }
}