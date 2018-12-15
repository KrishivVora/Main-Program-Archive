import java.util.*;
public class menu_area //a menu driven program that asks user to choose a shape and then takes input to calculate its area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fChoose a shape by pressing the corresponding button.");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        int a=sc.nextInt();
        double z=0.0;
        switch(a)
        {
            case 1:
            {
                System.out.println("Enter the radius 'r' of the circle.");
                double r=sc.nextDouble();
                z=Math.PI*r*r;
                break;
            }
            case 2:
            {
                System.out.println("Enter the side 's' of the square.");
                double s=sc.nextDouble();
                z=s*s;
                break;
            }
            case 3:
            {
                System.out.println("Enter the length 'l' of the rectangle.");
                System.out.println("Enter the breadth 'b' of the rectangle.");
                double l=sc.nextDouble();
                double b=sc.nextDouble();
                z=l*b;
                break;
            }
            default:
            {
                System.out.println("Wrong input. Printing null value of answer...");
                break;
            }
        }
        System.out.println("The area of your selected shape is: "+z);
    }
}