import java.util.*;
public class menu_volume //a menu driven program that asks user to choose a shape and then takes input to calculate its volume
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fChoose a shape by pressing the corresponding button.");
        System.out.println("1. Sphere");
        System.out.println("2. Cube");
        System.out.println("3. Cuboid");
        int a=sc.nextInt();
        double z=0.0;
        switch(a)
        {
            case 1:
            {
                System.out.println("Enter the radius 'r' of the sphere.");
                double r=sc.nextDouble();
                z=Math.PI*r*r*r*(4.0/3.0);
                break;
            }
            case 2:
            {
                System.out.println("Enter the edge length 's' of the cube.");
                double s=sc.nextDouble();
                z=s*s*s;
                break;
            }
            case 3:
            {
                System.out.println("Enter the length 'l' of the rectangle.");
                System.out.println("Enter the breadth 'b' of the rectangle.");
                System.out.println("Enter the breadth 'h' of the rectangle.");
                double l=sc.nextDouble();
                double b=sc.nextDouble();
                double h=sc.nextDouble();
                z=l*b*h;
                break;
            }
            default:
            {
                System.out.println("Wrong input. Printing null value of answer...");
                break;
            }
        }
        System.out.println("The volume of your selected shape is: "+z);
    }
}