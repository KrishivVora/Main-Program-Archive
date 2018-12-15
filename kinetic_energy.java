import java.util.*;
public class kinetic_energy //to find kinetic energy of a body using mass and velocity as input
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the mass of the body and velocity of the body, one by one.");
        double m=sc.nextDouble();
        double v=sc.nextDouble();
        double ke=0.5*m*Math.pow(v,2);
        System.out.println("Mass: "+m);
        System.out.println("Velocity: "+v);
        System.out.println("Kinetic energy of the body: "+ke);
    }
}