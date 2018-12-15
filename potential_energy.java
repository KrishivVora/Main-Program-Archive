import java.util.*;
public class potential_energy //to find gravitational potential energy of a body by taking mass, acceleration due to gravity and height as input
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the mass of the body, acceleration due to gravity and height of the body, one by one.");
        double m=sc.nextDouble();
        double g=sc.nextDouble();
        double h=sc.nextDouble();
        double pe=m*g*h;
        System.out.println("Mass: "+m);
        System.out.println("Acceleration due to gravity: "+g);
        System.out.println("Height of the body: "+h);
        System.out.println("Potential energy of the body: "+pe);
    }
}