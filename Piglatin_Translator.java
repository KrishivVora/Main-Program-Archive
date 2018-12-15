import java.util.*;
public class Piglatin_Translator
{    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the sentence.");
        String S=sc.nextLine().trim().toUpperCase();
        String S2=new String();
        StringTokenizer st=new StringTokenizer(S, ".,;: ");
        int x=st.countTokens();
        String arr[]=new String[x];
        int cnt=0, loc=0;
        char c=' ';
        while(st.hasMoreTokens())
        {
            arr[cnt]=st.nextToken();
            cnt++;
        }
        System.out.println("The Piglatin translation is:");
        outer:
        for(int i=0; i<x; i++)
        {
            inner:
            for(int j=0; j<(arr[i].length()); j++)
            {
                c=arr[i].charAt(j);
                if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                {
                    loc=j;
                    break inner;
                }
            }
            if(loc==0)
            {
                S2=arr[i]+"AY";
            }
            else
            {
                S2=arr[i].substring(loc)+arr[i].substring(0, loc)+"AY";
            }
            System.out.print(S2+" ");
        }
    }
}