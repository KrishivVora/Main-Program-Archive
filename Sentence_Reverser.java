import java.util.*;
public class Sentence_Reverser
{    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fHow many sentences would you like to enter?");
        int n=sc.nextInt();
        System.out.println("Enter the sentences one by one.");
        String S=new String();
        for(int cnt=0; cnt<=n; cnt++)
        {
            S=S+" "+sc.nextLine().trim();
        }
        StringTokenizer st=new StringTokenizer(S, "'.,;: ");
        int x=st.countTokens();
        String arr[]=new String[x];
        int cnt=0;
        while(st.hasMoreTokens())
        {
            arr[cnt]=st.nextToken();
            cnt++;
        }
        for(int i=x-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}