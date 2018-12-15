import java.util.*;
public class array_linear_search
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fHow many elements would you like to enter?");
        int m=sc.nextInt();
        System.out.println("Enter the elements of your array.");
        int x[]=new int[m];
        for(int i=0; i<m; i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.println("Enter what you are searching for.");
        int n=sc.nextInt();
        int s=0;
        for(int j=0; j<m; j++)
        {
            if(x[j]==n)
            {
                System.out.println("Number found at position "+(j+1)+".");
                s++;
                break;
            }
        }
        if(s==0)
        {
            System.out.println("Number not found.");
        }
    }
}