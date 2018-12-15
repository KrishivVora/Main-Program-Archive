import java.util.*;
public class vowel_counter
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
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
                i++;
        }
        System.out.println("The string you entered has "+i+" vowels.");
    }
}