import java.util.*;
public class area_triangle //to find area of a triangle by taking base and height of the triangle as input
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the base and height of the triangle, one by one.");
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        double area=0.5*b*h;
        System.out.println("Base: "+b);
        System.out.println("Height: "+h);
        System.out.println("Area of the triangle: "+area);
    }
}