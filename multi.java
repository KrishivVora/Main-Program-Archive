import java.util.*;
public class multi
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fWelcome! Enter a number to choose a function.");
        System.out.println("Press 1 to find the sum of two numbers.");
        System.out.println("Press 2 to swap two numbers.");
        System.out.println("Press 3 to find square of a number.");
        System.out.println("Press 4 to find cube of a number.");
        System.out.println("Press 5 to find area of a circle.");
        System.out.println("Press 6 to find area of a rectangle.");
        System.out.println("Press 7 to find the the SI on Rs 10000 at 18% p.a. for 20 years.");
        int a=sc.nextInt();
        switch(a)
        {
            case 1:
            {
                System.out.println("Enter the two numbers to be added, one by one.");
                int x=sc.nextInt();
                int y=sc.nextInt();
                int z=x+y;
                System.out.println("The sum of the two numbers is: "+z);
                break;
            }
            case 2:
            {
                System.out.println("Enter the two numbers to be swapped, one by one.");
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
                break;
            }
            case 3:
            {
                System.out.println("Enter the number to be squared.");
                double x=sc.nextInt();
                x=Math.pow(x,2.0);
                System.out.println("The squared number is: "+x);
                break;
            }
            case 4:
            {
                System.out.println("Enter the number to be cubed.");
                double x=sc.nextInt();
                x=Math.pow(x,3.0);
                System.out.println("The squared number is: "+x);
                break;
            }
            case 5:
            {
                System.out.println("Enter the radius of the circle.");
                double x=sc.nextDouble();
                double area=Math.pow(x,2.0)*Math.PI;
                System.out.println("The area of the circle is: "+area);
                break;
            }
            case 6:
            {
                System.out.println("Enter the length and the breadth of the rectangle, one by one.");
                double x=sc.nextDouble();
                double y=sc.nextDouble();
                double area=x*y;
                System.out.println("The area of the rectangle is: "+area);
                break;
            }
            case 7:
            {
                double SI=10000*0.18*20;
                System.out.println("The SI of the given data is: "+SI);
                break;
            }
            default:
            {
                System.out.println("WRONG INPUT");
            }
        }
    }
}