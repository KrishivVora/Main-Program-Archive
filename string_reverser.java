import java.util.*;
public class string_reverser // counts number of characters and vowels and then reverses the string
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string.");
        String S=sc.nextLine();
        int n=S.length();
        String SX=new String();int cnt; char c; int vcnt=0;
        for(cnt=(n-2);cnt>=0;cnt--)
        {
            c=S.charAt(cnt);
            SX=SX+c;
            if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
            vcnt++;
        }
        System.out.println("Number of characters is: "+n);
        System.out.println("Number of vowels is: "+vcnt);
        System.out.println("Reversed string: "+SX);
    }
}