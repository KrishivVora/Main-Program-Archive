import java.util.*;
public class array_binary_search
{
    static void binary_template()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the number of elements you would like to enter.");
        int len=sc.nextInt();
        int n[]=new int[len];
        System.out.println("Enter the elements of your array one by one.");
        for(int cnt=0; cnt<len; cnt++)
        n[cnt]=sc.nextInt();
        System.out.println("Enter the number you would like to search for.");
        int no=sc.nextInt();
        int checker=0, L=0, U=len-1, M=0;
        while(L<=U)
        {
            M=(L+U)/2;
            if(no>n[M])
            {
                L=M+1;
            }
            else if(no<n[M])
            {
                U=M-1;
            }
            else if(no==n[M])
            {
                checker=1;
                break;
            }
        }
        if(checker==1)
        {
            System.out.println("Number found at position: "+(M+1)+".");
        }
        else
        {
            System.out.println("Number not found.");
        }
    }
}