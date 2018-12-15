import java.util.*;
public class character_replacer
{
    static void method()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a string.");
        String S=sc.nextLine();
        String S1;
        String S2;
        System.out.println("Enter the character to be replaced.");
        String S3=sc.next();
        char c=S3.charAt(0);
        int a=S.length();
        char c1;
        for(int cnt=0;cnt<a;cnt++)
        {
            c1=S.charAt(cnt);
            if(c1==c)
            {
                S1=S.substring(0,cnt);
                S2=S.substring(cnt+1,a);
                S3=S1+"*"+S2;
            }
        }
        System.out.println(S3);
    }
}