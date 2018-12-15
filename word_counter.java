import java.util.*;
public class word_counter
{
    static void method()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a string.");
        String S=sc.nextLine();
        int a=S.length();
        char c;
        int i=0;
        for(int cnt=0;cnt<a;cnt++)
        {
            c=S.charAt(cnt);
            if(c==' ')
                i++;
        }
        System.out.println("The string you entered has "+(i+1)+" words.");
    }
}