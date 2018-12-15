import java.util.*;
public class multiples_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a number and this program will print all multiples of 5 upto that number.");
        int n=sc.nextInt();
        int cnt=5;
        do
        {
            System.out.println(cnt);
            cnt=cnt+5;
        }
        while(cnt<=n);
    }
}