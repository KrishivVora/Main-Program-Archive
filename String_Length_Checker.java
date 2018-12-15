import java.util.*;
public class String_Length_Checker
{    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the sentence.");
        String S=sc.nextLine().trim();
        StringTokenizer st=new StringTokenizer(S, ".,;: ");
        int x=st.countTokens();
        String arr[]=new String[x];
        int cnt=0;
        while(st.hasMoreTokens())
        {
            arr[cnt]=st.nextToken();
            cnt++;
        }
        int ibig=0, ismall=0, big, small;
        big=arr[0].length();
        small=arr[0].length();
        for(int i=0; i<x; i++)
        {
            if(arr[i].length()<small)
            {
                ismall=i;
                small=arr[i].length();
            }
            else if(arr[i].length()>big)
            {
                ibig=i;
                big=arr[i].length();
            }
        }
        System.out.println("Shortest word = "+arr[ismall]);
        System.out.println("Length = "+small);
        System.out.println("Longest word = "+arr[ibig]);
        System.out.println("Length = "+big);
    }
}