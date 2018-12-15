import java.util.*;
public class String_Repeat_Letter_Remover
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
            if(c==c2)
            {
                S2=S.substring(cnt-1, cnt+1);
                S3=S.substring(cnt-1, cnt);
                S=S.replace(S2, S3);
                cnt--;
            }
        }
        System.out.println("New String:");
        System.out.println(S);
    }
}