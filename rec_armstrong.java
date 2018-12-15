import java.util.*;
public class rec_armstrong
{
    double output=0.0;
    public double digitrem(int r)
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
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int n=sc.nextInt();
        double outputx=digitrem(n);
        if(output==n)
        {
            System.out.println("The number is an Armstrong number.");
        }
        else
        {
            System.out.println("The number is NOT an Armstrong number.");
        }
    }
}