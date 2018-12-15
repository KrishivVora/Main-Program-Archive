import java.util.*;
public class Word_Deleter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a string.");
        String S=sc.nextLine().trim();
        char c=' ';
        char c2=' ';
        String S2=new String();
        String S3=new String();
        for(int cnt=1; cnt<S.length(); cnt++)
        {
            c=S.charAt(cnt-1);
            c2=S.charAt(cnt);
            if(c==c2 && c==' ' && c2==' ')
            {
                S2=S.substring(cnt-1, cnt+1);
                S3=S.substring(cnt-1, cnt);
                S=S.replace(S2, S3);
                cnt--;
            }
        }
        System.out.println("Enter the word to be removed.");
        String gar=sc.next();
        System.out.println("Enter the position of the word to be removed.");
        int z=sc.nextInt();
        z--;
        StringTokenizer st=new StringTokenizer(S, ".,;: ");
        int x=st.countTokens();
        String arr[]=new String[x-1];
        int i=0;
        while(st.hasMoreTokens())
        {
            if(i==z)
            {
                arr[i]=st.nextToken();
            }
            arr[i]=st.nextToken();
            i++;
        }
        System.out.println();
        for(int j=0; j<x-1; j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}