import java.util.*;
       /*If ‘m’ and ‘v’ denote the mass and velocity of any moving object WAP to input
       the values of ‘m’ and ‘v’ and find out the Kinetic Energy of a body which is
       given by the formula (KE = ½ mv2)*/
public class Assignment
{
   Scanner sc=new Scanner(System.in);    
    public void kineticEnergy()
    {
        double m;
        double v;
        double k;
        System.out.println("Enter Mass of Moving Object:");
        m=sc.nextDouble();
        System.out.println("Enter Velocity of Moving Object:");
        v=sc.nextDouble();
        k=0.5*m*v*v;
        System.out.println("Kinetic Energy of Moving Object is: "+k);
        
    }
     /* WAP to find out the Potential Energy given by the formula (PE= m*g*h)
     where the values of m, g and h are entered by the user.*/
    public void potentialEnergy()
    {
        double m;
        double g;
        double h;
        System.out.println("Enter Mass of Object");
        m=sc.nextDouble();
        System.out.println("Enter Height of Object");
        h=sc.nextDouble();
        System.out.println("Enter G");
        g=sc.nextDouble();
        double p=m*g*h;
        System.out.println("Potenial Energy is: "+p);
    }
    /*WAP to input the Base and Height of a Right angled Triangle and calculate the
    Area using the formula
    Area = ½ Base X Height*/
    public void triangleArea()
    {
        double base,height, area;
        System.out.println("Enter Height of Triangle");
        height=sc.nextDouble();
        System.out.println("Enter Base of Triangle");
        base=sc.nextDouble();
        area=0.5*base*height;
        System.out.println("Area of triangle is: "+area);
    }
    /*WAP to swap the values stored in two variables (using a third variable)
    Display the values of the two variables before and after swapping.*/
    public void swap1()
    {
        int a,b,c;
        System.out.println("Enter the two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    public void swap2()
    {
        int a,b;
        System.out.println("Enter the two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    /*WAP to input the Basic Salary of an employee and Calculate his Gross and Net
     Salary based on the information given below
     D.A. (Dearness Allowance) = 75% of Basic Salary
     H.R.A. (House Rent Allowance)= 25% of Basic Salary
     P.F. (Provident Fund) = 12% of (Basic + D.A.)
     Gross Salary = Basic + D.A + H.R.A
     Net Salary = Gross Salary – P.F*/
     public void employee()
     {
         double bs,da,hra,pf,gross,net;
         System.out.println("Enter the basic salary ");
         bs=sc.nextDouble();
         da=(0.75)*bs;
         hra=(0.25)*bs;
         pf=(0.12)*(bs+da);
         gross=bs+da+hra;
         net=gross-pf;
         System.out.println("Gross Salary is "+gross);
         System.out.println("Net Salary is "+net);
    }
    public void cubeSquare()
    {
        double a,b;
        System.out.println("Enter two numbers: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        if(a>b)
        {
            b=b*b;
            a=a*a*a;
        }
        else
        {
            a=a*a;
            b=b*b*b;
        }
        System.out.println(a+" "+b);
    }
}