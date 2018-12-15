import java.util.*;
public class rec_factorial
{
    public int factorial(int n)
    {
        if(n>1)
        {
            n=n*factorial(n-1);
        }
        else
        {
            return 1;
        }
        return n;
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the number whose factorial is to be calculated.");
        int input=sc.nextInt();
        int output=factorial(input);
        System.out.println("The factorial of the number is: "+output);
    }
}
