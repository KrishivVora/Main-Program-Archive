import java.util.*;
public class hol_carton
{
    static int n, b6, b12, b24, b48, r;
    hol_carton()
    {
        n=0;
        b6=0;
        b12=0;
        b24=0;
        b48=0;
        r=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of boxes. (between 0 and 1000)");
        n=sc.nextInt();
    }
    int calculate()
    {
        int n1=n;
        b48=n1/48;
        n1=n1%48;
        b24=n1/24;
        n1=n1%24;
        b12=n1/12;
        n1=n1%12;
        b6=n1/6;
        n1=n1%6;
        if(n1>0)
        {
            r=n1;
            b6+=1;
        }
        int t=b6+b12+b24+b48;
        return t;
    }
    void display(int t)
    {
        System.out.println(n+" boxes will be sorted as follows: ");
        System.out.println();
        if(b48>0)
            System.out.println("48 x "+b48+" = "+(48*b48));
        if(b24>0)
            System.out.println("24 x "+b24+" = "+(24*b24));
        if(b12>0)
            System.out.println("12 x "+b12+" = "+(12*b12));
        if(b6>0)
        {
            if(r>0)
                System.out.println("6 x "+(b6-1)+" = "+(6*(b6-1)));
            else if(r==0)
                System.out.println("6 x "+b6+" = "+(6*b6));
        }
        if(r>0)
            System.out.println("Remaining boxes "+r+" x 1 = "+r);
        else
            System.out.println("Remaining boxes = 0");
        System.out.println("Total number of boxes = "+n);
        System.out.println("Total number of cartons = "+t);
    }
    public static void main(String args[])
    {
        hol_carton obj=new hol_carton();
        obj.input();
        if(n>1000 || n<0)
        {
            System.out.println("INVALID LENGTH");
        }
        else
        {
            int t=obj.calculate();
            obj.display(t);
        }
    }
}