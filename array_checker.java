import java.util.*;
public class array_checker
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[15];
        System.out.println("ENTER THE BLOCK CHAIN OF 15 DIGITARIANS.");
        for(int a=0; a<15; a++)
        {
            x[a]=sc.nextInt();
        }
        System.out.println("ENTER THE NUMBER YOU WOULD LIKE TO SEARCH FOR.");
        int g=sc.nextInt();
        for(int b=0; b<15; b++)
        {
            if(g==x[b])
            {
                System.out.println("FOUND IT =D El position is number "+(b+1)+".");
            }
        }
    }
}