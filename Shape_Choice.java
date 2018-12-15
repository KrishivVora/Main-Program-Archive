import java.util.*;
public class Shape_Choice
{
    public void method()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1- Area of a circle");
        System.out.println("2- Area of a triangle");
        System.out.println("3- Area of a rectangle");
        System.out.println("Make your choice and press enter:");
        int ch=sc.nextInt();
        double area;
        switch(ch)
        {
            case 1:
            System.out.println("Enter the radius:");
            int r=sc.nextInt();;
            area=3.14*r*r;
            break;
            
            case 2:
            System.out.println("Enter the base:");
            int bs=sc.nextInt();
            System.out.println("Enter the height:");
            int h=sc.nextInt();
            area=0.5*bs*h;
            break;
            
            case 3:
            System.out.println("Enter the length:");
            int l=sc.nextInt();
            System.out.println("Enter the breadth:");
            int br=sc.nextInt();
            area=l*br;
            break;
            
            default:
            System.out.println("Wrong Input");
            break;
        }
    }
}