import java.util.*;
public class hol_armstrong
{
    static double output;
    hol_armstrong()
    {
        output = 0.0d;
    }
    double digitrem(int r)
    {
        if(r>=10)
        {
            output=Math.pow(r%10,3)+digitrem(r/10);
        }
        else if(r<10)
        {
            output=Math.pow(r,3);
        }
        return output;
    }
    void display(int m, int n)
    {
        if(m<=n)
        {
            if(m==(digitrem(m)))
            {
                System.out.println(m);
            }
            display((m+1), n);
        }
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        hol_armstrong obj = new hol_armstrong();
        System.out.println("\fEnter the range between which all Armstrong numbers should be printed.");
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m>=3000 || n>=3000)
        {
            System.out.println("Error. The entered values are more than 3000.");
        }
        else
        {
            System.out.println("The Armstrong numbers between "+m+" and "+n+" are:");
            obj.display(m+1,n-1);
        }
    }
}